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
content provider in the ``AndroidManifest.xml`` file:

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
"""""""""""
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
""""""""""""""
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
""""""""""""""""""""""
Content Value Builders (or value builders) are generated for each item in a 
contract, they are thin wrappers around Content Values with the purpose of 
providing some clarity in your code.

All value builders derive from 
|jdoc| :java:extdoc:`AbstractValuesBuilder <com.robotoworks.mechanoid.db.AbstractValuesBuilder>`,
the following sections outline their main functionality.

Inserting
'''''''''
We can use the generated values builder in the contract to insert.

.. code-block:: java

   Uri omletteUri = Recipes.newBuilder()
   .setTitle("Omelette")
   .setDescription("Wonderful omelette with cheese")
   .setAuthorId(ContentUris.parseId(authorJoeUri))
   .insert();
   
Updating
''''''''
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
''''''''''''''''''''''
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

Content URI Notifications
'''''''''''''''''''''''''
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
|jdoc| :java:extdoc:`SQuery <com.robotoworks.mechanoid.db.SQuery>`. 

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
Expressions with ``SQuery`` are performed with the ``expr(...)``
method overloads, chaining them together to form a full query.

Operators in expressions such as ``=``, ``>=``, ``<=``, ``LIKE``, etc, are provided
by constants in |jdoc| :java:extdoc:`SQuery.Op <com.robotoworks.mechanoid.db.SQuery.Op>`,
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
``title = "Omelette" AND description LIKE "%tasty%"``, which would mean
there would be little need to explicitly call the ``and()`` method between
each expression.

Updating Records
""""""""""""""""
With |jdoc| :java:extdoc:`SQuery <com.robotoworks.mechanoid.db.SQuery>` we can
update record with criteria, the following example shows how to change
all recipes with the title of Omelette to Scrambled Eggs.

.. code-block:: java

   ContentValues values = Recipes.newBuilder()
      .setTitle("Scrambled Eggs")
      .getValues();
     
     SQuery.newQuery()
      .expr(Recipes.TITLE, Op.EQ, "Omelette")
      .update(Recipes.CONTENT_URI, values);



   

