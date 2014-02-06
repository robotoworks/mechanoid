The |mechdb| API
================
.. note:: This section assumes you have created your database definition.
   |ref| See :doc:`lang`

This topic describes how to work with your database which you define in
a ``mechdb`` file, such as how to insert, update, and bind data using the 
Android Adapter API, and CursorLoader API.

When we discuss the |mechdb| API, it includes both the base API provided in 
the ``com.robotoworks.mechanoid.db`` package of the *Mechanoid Library Jar*, as 
well as the generated Content Provider API from your |mechdb| database 
definitions.

The running example is the Recipes Example, which is an example project
provided in the Mechanoid Source on github, it is useful to refer to this
example to get a full picture of the generated API.
   
Registering the Provider
------------------------
Before we can use the generated API, you must register your generated 
content provider in the ``AndroidManifest.xml`` file.

.. code-block:: xml

   <provider
      android:name="com.robotoworks.examples.recipes.content.RecipesDBContentProvider"
      android:authorities="com.robotoworks.examples.recipes.content.recipesdb"
      android:exported="false" />
      
The default authority of the content provider is of the format 
``{package}.{database_name}`` all lower-case.

For instance, given the following |mechdb| definition:

.. code-block:: mechdb

   package com.robotoworks.examples.recipes.content 
   
   database RecipesDB {
      ...
   }
   
The authority would be ``com.robotoworks.examples.recipes.content.recipesdb``.

Overriding the Default Provider Authority
-----------------------------------------
The default authority is usually sufficient, however if you intend to use 
|mechdb| in a library project, and use the generated Content Provider API across 
multiple projects, its not possible to run applications with the same same 
content provider authority.

|mechdb| provides a workaround to this so you can provide a unique authority 
for each application by adding a class to with the same package as the generated 
content provider, with the name ``{database_name}ContentProviderAuthority``, 
with a single static final String field ``CONTENT_AUTHORITY``.

The following example demonstrates this workaround:

.. code-block:: java

   package com.robotoworks.examples.recipes.content;
    
   public class RecipesDBContentProviderAuthority {
       public static final String CONTENT_AUTHORITY = "your.new.authority.here";
   }
   
After adding this class, do not forget to also update your provider registration 
in the manifest, ie:-

.. code-block:: xml

   <provider
       android:name="com.robotoworks.examples.recipes.content.RecipesDBContentProvider"
       android:authorities="your.new.authority.here"
       android:exported="false" />
     
The following lines should be then added to your ``proguard-project.txt`` to make
sure ``CONTENT_AUTHORITY`` is not renamed:

.. code-block:: java


   -keep class com.robotoworks.examples.recipes.content.RecipesDBContentProviderAuthority
   -keepclassmembers class com.robotoworks.examples.recipes.content.RecipesDBContentProviderAuthority {
       *;
   }

       
Content Provider Contract
-------------------------
A Content Provider Contract, is a definition of each table and view in your 
database, where each table or view define their Content URI and 
column constants. Additionally in a Mechanoid Content Provider Contract, a
few utility methods, and a ContentValues Builder are also generated.

To put things into perspective, let's take the following table definition in
a |mechdb| File.

.. code-block:: mechdb
   
   package com.example.recipes.content
   
   database RecipesDB {
      migration {
         create table recipes (
            _id integer primary key autoincrement,
            title text,
            description text
         );
      }
   }
   
Mechanoid will generate a Contract for you that is similar to the following 
(the body of method blocks and some code have been removed for clarity):

.. code-block:: java

   public class RecipesDBContract  {
   
      interface RecipesColumns {
         String TITLE = "title";
         String DESCRIPTION = "description";
         String AUTHOR_ID = "author_id";
      }
   
      public static class Recipes implements RecipesColumns, BaseColumns {
         public static final Uri CONTENT_URI = 
               BASE_CONTENT_URI.buildUpon().appendPath("recipes").build();
      
         public static final String CONTENT_TYPE =
                  "vnd.android.cursor.dir/vnd.recipesdb.recipes";
      
         public static final String ITEM_CONTENT_TYPE =
            "vnd.android.cursor.item/vnd.recipesdb.recipes";
      
         public static Uri buildUriWithId(long id)
         public static int delete();
         public static int delete(String where, String[] selectionArgs);
         
         public static Builder newBuilder();
         public static class Builder extends AbstractValuesBuilder {
            public Builder setTitle(String value);
            public Builder setDescription(String value);
            public Builder setAuthorId(long value);
         }
      }
   }
   
The following sections demonstrate the purpose of the contract.

Projections
-----------
Content Provider Queries require projections, we can use the generated column
definitions from the contract to construct our projections, as follows.

.. code-block:: java

   private static final String[] PROJECTION = {
      Recipes._ID,
      Recipes.TITLE,
      Recipes.DESCRIPTION
   };
   
We can then use our projection with a content provider, for instance:-

.. code-block:: java
   
   ContentResolver resolver = context.getContentResolver();
   
   Cursor cursor = resolver.query(Recipes.CONTENT_URI, PROJECTION, null, null, null);


Basic Deleting
--------------
Deleting with the contract is straight forward as follows.

.. code-block:: java
   
   //
   // Delete everything
   //
   int numDeleted = Recipes.delete();
   
   //
   // Delete only Omlettes
   //
   int numDeleted = Recipes.delete(
                           Recipes.TITLE + " LIKE ?", 
                           new String[]{"%omelette%"});
 
Content Value Builders
----------------------
Content Value Builders (or value builders) are generated for each item in a 
contract, they are thin wrappers around Content Values with the purpose of 
providing some clarity in your code.

All value builders derive from 
:java:extdoc:`AbstractValuesBuilder <com.robotoworks.mechanoid.db.AbstractValuesBuilder>`,
the following sections outline their main functionality.

Inserting
"""""""""
We can use the generated values builder in the contract to insert.

.. code-block:: java

   Uri omletteUri = Recipes.newBuilder()
   .setTitle("Omelette")
   .setDescription("Wonderful omelette with cheese")
   .setAuthorId(ContentUris.parseId(authorJoeUri))
   .insert();
   
Updating
""""""""
If we know the id of a record we want to update, we can use the values
builder to also upodate record.

.. code-block:: java
   
   //
   // Update recipe with id of 123
   //
   Recipes.newBuilder()
   .setTitle("Omelette")
   .setDescription("Wonderful omelette with cheese")
   .setAuthorId(ContentUris.parseId(authorJoeUri))
   .update(123);

Updating with criteria
""""""""""""""""""""""
To update with selection criteria, we can use the ``SQuery`` class from the
Mechanoid Library.

.. code-block:: java
   
   //
   // Change all omlettes to scrambled eggs
   //
   
   SQuery query = SQuery.newQuery()
                     .expr(Recipes.TITLE, Op.EQ, "Omellete");
         
   int rowsAffected = Recipes.newBuilder()
      .setTitle("Scrambled Eggs")
      .setDescription("Wonderful omelette with cheese")
      .setAuthorId(ContentUris.parseId(authorJoeUri))
      .update(query);

Change Notifications
""""""""""""""""""""
Mechanoid makes use of the Content Provider notification system, which
in most cases is useful, however you may not always want to notify when you
change your data, we can tell a builder not to notify a change by using
the overload for insert or update that excepts a boolean arg so specify wether
to notify, which by default, is true, the following example demonstrates this
for inserts:

.. code-block:: java
   :emphasize-lines: 5
   
   Uri omletteUri = Recipes.newBuilder()
   .setTitle("Omelette")
   .setDescription("Wonderful omelette with cheese")
   .setAuthorId(ContentUris.parseId(authorJoeUri))
   .insert(false);

We set the argument to false to specify we do not want to notify a change
for this insert.

.. note::
   Switching notifications off briefly like this can be useful when you are
   performing a number of changes, if you have bound data and you are inserting
   repeatedly in the background, you could spam the notification system and
   this might cause your UI to freeze.
   
Query API
---------
Selecting data in |mechdb| is performed using a single utility class,
:java:extdoc:`SQuery <com.robotoworks.mechanoid.db.SQuery>`. 

``SQuery`` provides a simple way to specify selection criteria, it was
conceived as a substitute for string concatentation (which can often look
cumbersome in code) but then evolved to do more.

The following example shows how we can use ``SQuery`` to select all recipes 
with a title equal to Omelette or Scrambled Eggs.

.. code-block:: java

   Cursor cursor = SQuery.newQuery()
      .expr(Recipes.TITLE, Op.EQ, "Omelette")
      .or()
      .expr(Recipes.TITLE, Op.EQ, "Scrambled Eggs")
      .select(Recipes.CONTENT_URI);
      
The above query translates to the SQL expression
``title = "Omelette" OR title = "Scrambled Eggs"``.

``SQuery`` allows for a chain of expressions, and then a terminating call to
either select, update or delete.

The following sections describe this in detail.

Expressions
"""""""""""
Expressions with ``SQuery`` are performed with the ``expr()``
method overloads, which can be chained to form a full query.

Operators in expressions such as ``=``, ``>=``, ``<=``, ``LIKE``, etc, are provided
by constants in :java:extdoc:`SQuery.Op <com.robotoworks.mechanoid.db.SQuery.Op>`,
for instance, we can use ``OP.EQ`` for an ``=`` operator, or ``Op.LIKE`` for the
``LIKE`` operator, the javadoc for ``SQuery.Op`` explains what each operator
means.

The ``and()`` and ``or()`` of ``SQuery`` represent the ``AND`` and ``OR`` SQL
operators, and they can be used between expressions, if they are not used then
they will be AND'd together by default, for instance, given the following example:

.. code-block:: java
   
   Cursor cursor = SQuery.newQuery()
      .expr(Recipes.TITLE, Op.EQ, "Omelette")
      .expr(Recipes.DESCRIPTION, Op.LIKE, "%tasty%")
      .select(Recipes.CONTENT_URI);
      
Will translate to the SQL expression 
``title = "Omelette" AND description LIKE "%tasty%"``.

Updating Records
""""""""""""""""
With :java:extdoc:`SQuery <com.robotoworks.mechanoid.db.SQuery>` we can
update records by using the terminating method ``update()``, the following example shows how to change
all recipes with the title of Omelette to Scrambled Eggs.

.. code-block:: java

   ContentValues values = Recipes.newBuilder()
      .setTitle("Scrambled Eggs")
      .getValues();
     
     SQuery.newQuery()
      .expr(Recipes.TITLE, Op.EQ, "Omelette")
      .update(Recipes.CONTENT_URI, values);
      
Deleting Records
""""""""""""""""
Similar to updating, we can also delete with a terminating ``delete()`` method
call, the following query deletes all recipes with the a title of Omelette:

.. code-block:: java

     SQuery.newQuery()
      .expr(Recipes.TITLE, Op.EQ, "Omelette")
      .delete(Recipes.CONTENT_URI);

Counting Matches
""""""""""""""""
Sometimes it is useful to know how many records match a given criteria, the
following example shows how to count all recipes with a title of Omelette,
using the terminating ``count()`` method:

.. code-block:: java

     int numOmelettes = SQuery.newQuery()
                           .expr(Recipes.TITLE, Op.EQ, "Omelette")
                           .count(Recipes.CONTENT_URI);

Exists Query
""""""""""""
Like counting, we can just test if records exist matching a given criteria,
using the ``exists()`` terminating method:

.. code-block:: java

     boolean hasOmelettes = SQuery.newQuery()
                              .expr(Recipes.TITLE, Op.EQ, "Omelette")
                              .exists(Recipes.CONTENT_URI);                         
                      
Selecting Single Values
"""""""""""""""""""""""
Sometimes we are only interested in a single value when performing a query,
to select just a single value we can use one of the ``first{type}()`` terminating
methods, where ``{type}`` can be one of the supported primitive types for
instance:- ``firstBlob()``, ``firstBoolean()``, ``firstDouble()``, ``firstInt()``, etc.

The following query shows how to select just the description
of the first matching recipe with a title of Omelette.

.. code-block:: java

   String description = SQuery.newQuery()
                  .expr(Recipes.TITLE, Op.EQ, "Omelette")
                  .firstString(Recipes.CONTENT_URI, Recipes.DESCRIPTION);    

The second argument of ``firstString()`` we provide the column name we want
to get, in this case we want ``Recipes.DESCRIPTION``.

ActiveRecord API
----------------
As well as the Builder and Query API, |mechdb| also generates an ActiveRecord
implementation for every table and view that have declared an ``_id primary key`` 
column.

ActiveRecord is a pattern where a table is directly mapped to a class that
represents a single row. The following example shows how we can use the 
``RecipesRecord`` class to create a new recipe.

.. code-block:: java

   RecipesRecord record = new RecipesRecord();
   record.setTitle("Omelette");
   record.setDescription("Wonderful omelette with cheese");
   record.save();
   
All generated ActiveRecord implementations derive 
from :java:extdoc:`ActiveRecord <com.robotoworks.mechanoid.db.ActiveRecord>`.

Using ActiveRecord to manipulate our data can sometimes provide better clarity
in code.

Selecting Records
"""""""""""""""""
The simplest way to select a record is by its id, for this we can use the generated
``get(long)`` method as follows:

.. code-block:: java

   RecipesRecord record = RecipesRecord.get(123);

To select records with criteria, we use the ``select(Uri)`` and ``selectFirst(Uri)``
of :java:extdoc:`SQuery <com.robotoworks.mechanoid.db.SQuery>`.

For instance to select all recipes we can do this:

.. code-block:: java

   List<RecipesRecord> recipes = SQuery.newQuery()
                                 .select(Recipes.CONTENT_URI);
   
To select the first record with a title of Omelette, we can use the ``selectFirst(Uri)``
terminating method as follows:

.. code-block:: java

   RecipesRecord recipe = SQuery.newQuery()
                  .expr(Recipes.TITLE, Op.EQ, "Omelette")
                  .selectFirst(Recipes.CONTENT_URI); 
                                   
Creating/Updating Records
"""""""""""""""""""""""""
Creating or updating records can be achieved using the 
:java:extdoc:`save() <com.robotoworks.mechanoid.db.ActiveRecord.save>` 
method.

If a record is saved with an ``id`` set to zero (which is the default when
constructing new records), then calling ``save()`` will cause a 
Sqlite ``INSERT`` statement for the record. If the ``id`` is greater than zero,
then an ``UPDATE`` will occur instead.

For instance the following example will insert a new record:

.. code-block:: java

   RecipesRecord record = new RecipesRecord();
   record.setTitle("Omelette");
   record.setDescription("Wonderful omelette with cheese");
   record.save();

The following example will update an existing record since we first retrieve
it with its id:

.. code-block:: java

   RecipesRecord record = RecipesRecord.get(123);
   record.setTitle("Scrambled Eggs");
   record.setDescription("Traditional scrambled eggs on buttery toast");
   record.save();
   
   
We can also explicitly force an ``INSERT`` or ``UPDATE`` by calling ``insert()`` or
``update()`` respectively, for instance:

.. code-block:: java

   RecipesRecord record = new RecipesRecord();
   record.setTitle("Omelette");
   record.setDescription("Wonderful omelette with cheese");
   record.insert();
   
By doing so you are responsible for any issues that might occur such as inserting
into an existing record (with the same unique id), you should always try to use 
the ``CONFLICT REPLACE`` clause in your table definitions if you intend to insert 
over an already existing record.
   
Dirty State
"""""""""""
All fields in an ActiveRecord are tracked with a dirty flag, when we first
retrieve a record, ie:- ``RecipesRecord record = RecipesRecord.get(123);`` the
fields are not flagged as dirty, when we set a field, that field will become dirty.

The purpose of the dirty flag is to only persist fields that have been changed,
when saving, ``ContentValues`` will be constructed and only those values
that have changed will be set.

Sometimes this might not be desirable and we can either make all fields
dirty, or not dirty by called the 
:java:extdoc:`makeDirty(boolean) <com.robotoworks.mechanoid.db.ActiveRecord.makeDirty>`
with true or false respectively.
 
Projection and Column Indices
"""""""""""""""""""""""""""""
Each generated ActiveRecord has a ``PROJECTION`` constant and ``Indices`` that
contain a list of constants that represent the index into the projection.

For instance, look at the ``RecipesRecord`` example:

.. code-block:: java

   public static String[] PROJECTION = {
      Recipes._ID,
      Recipes.TITLE,
      Recipes.DESCRIPTION,
      Recipes.AUTHOR_ID
   };
   
   public interface Indices {
      int _ID = 0;
      int TITLE = 1;
      int DESCRIPTION = 2;
      int AUTHOR_ID = 3;
   }

ActiveRecord uses these internally for mapping ``ContentValues`` when persisting
but they can also be useful as projections in ``CursorLoader`` queries, or
accessing indices in a cursor (assuming the projection was used when making a 
cursor query).

If we know a cursor query was made using the generated ActiveRecord ``PROJECTION``
we can take advantage of constructing an ActiveRecord from a cursor:

.. code-block:: java

   // Load a record from a cursor that we know
   // to be created using RecipesRecord.PROJECTION
   RecipesRecord record = RecipesRecord.fromCursor(cursor);
   
Change Notification
"""""""""""""""""""
ActiveRecord makes use of the Content Provider notification system,
by default, ActiveRecord's will issue change notifications, to disable
this we must call one of the ``save()`` or ``delete()`` overloads with a boolean
flag with false to indicate we do not want to notify any cursors of a change,

for instance:

.. code-block:: java
   :emphasize-lines: 4
   
   RecipesRecord record = new RecipesRecord();
   record.setTitle("Omelette");
   record.setDescription("Wonderful omelette with cheese");
   record.save(false);
   
Here, when saving the record we set the notify flag to false.