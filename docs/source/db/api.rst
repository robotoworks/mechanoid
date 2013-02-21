The |mechdb| API
================
This topic describes how to work with your database which you define in
a ``mechdb`` file, such as how to insert, update, and bind data using the Android
Adapter API, and CursorLoader API.

When we discuss the |mechdb| API, it includes both the base API provided in 
the ``com.robotoworks.mechanoid.db`` package of the *Mechanoid Library Jar*, as 
well as the generated Content Provider API from your |mechdb| database 
definitions.

The running example is the Recipes Example, which is an example project
provided in the Mechanoid Source on github, it is useful to refer to this
example to get a full picture of the generated API.

.. note:: This section assumes you have created your database definition.
   |ref| See :doc:`lang`
   
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
