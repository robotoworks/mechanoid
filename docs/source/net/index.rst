|mechnet|
=========
.. note:: 
   You must install the Mechanoid Plugin before you can use |mechnet|.
   |ref| See :doc:`/start`
   
|mechnet| is a JSON over REST service client code generator for Android driven 
by a language (DSL) to succinctly describe JSON over REST services.

The grammar of the DSL closely models the HTTP methods GET, PUT, POST and DELETE 
for example, the following defines a service client called ``BookService`` with
a single ``GET`` method that returns an array of ``Book``

.. code-block:: mechnet

   client BookService "http://books.mechanoid.com" {
       get getBooks /books {
           params limit:long, query:String
    
           response Book[]
       }
   }

The DSL generates service client code, entities and serializers using fast JSON 
serialization and deserialization directly from streams 
via ``JsonReader`` and ``JsonWriter``.

The |mechnet| File
------------------
We define a service client with |mechnet| in a file with the extension ``mechnet``,
for instance ``recipes.mechnet``.

We can create a mechnet file using the |mechnet| File Wizard. In eclipse go to
``New > Other > Mechanoid > Mechanoid Net File``, the |mechnet| wizard will
launch:

.. figure:: /images/screens/wizard-mechnet.png

The following should be considered when providing values for the wizard.

* **Folder** is where you want to create the file typically ``/project/models`` 
  is a good place to keep your Mechanoid Files.
* **Package** is where you want to generate the code, all code will be generated 
  to the given java package.
* **Name** is the name of your service client, this name will be used for 
  your generated service client.
* **Default Base Url** is an optional value you can use to provide the base
  URL of all your REST methods, if you do not provide this then you will
  only be able to create an instance of your generated service client with a 
  mandatory base URL.
  
Once completing the wizard, a new file will be created, the contents will
contain an empty service client definition:

.. code-block:: mechnet
   
   package com.robotoworks.example.books.content
   
   client BookServiceClient "http://books.robotoworks.com" {

   }

