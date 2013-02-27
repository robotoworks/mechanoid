.. |opsvc| replace:: Operation Service
.. |opsvcdef| replace:: Operation Service Definition

|mechops|
=========
|mechops| is a framework for defining and performing potentially long-running 
operations asynchronously, decoupled from your UI.

You define your operations using a simple language (DSL), implement some 
generated operation stubs and then use a generated API to execute them.

The approach uses the Android ``Service`` Component, along with a supporting 
classes to queue and execute operations in the background.

The design was first seen in 
|link| `Virgil Dobjanschi's Google IO 2010 REST Presentation <http://www.youtube.com/watch?v=xHXn3Kg2IQE>`_

In |mechops| we call this design the **Operation Service Pattern**.

We can define an Operation Service using the |mechops| DSL, for example:-

.. code-block:: mechops

   package com.robotoworks.example.movies.ops
   
   service Movies {
      operation getMovies()
      operation addMovie(String title, String description, int year)
   }
   
In this example we define two operations, ``getMovies()`` and ``addMovie(...)``.

The following sections describe the syntax of the DSL, and how we can use the
generated Operation Service API.

The |mechops| File
------------------
We define our |opsvc| with |mechops| in a file with the extension ``mechops``,
for instance ``movies.mechops``.

We can create a mechops file using the |mechops| File Wizard. In eclipse go to
``New > Other > Mechanoid > Mechanoid Ops File``, the |mechops| wizard will
launch:

.. figure:: /images/screens/wizard-mechops.png

The following should be considered when providing values for the wizard.

* **Folder** is where you want to create the file typically ``/project/models`` 
  is a good place to keep your Mechanoid Files.
* **Package** is where you want to generate the code, all code will be generated 
  to the given java package.
* **Name** is the name of your operation service, this name will be used as a 
  prefix for all the classes that make up your Operation Service API
  
Once completing the wizard, a new file will be created, the contents will
contain an empty service definition:

.. code-block:: mechops

   package com.robotoworks.example.movies.ops
   
   service Movies {
      
   }
   
Registering the Service
-----------------------
|mechops| uses an Android ``Service`` component implementation for every 
|opsvcdef| you define, this service must be register in the ``AndroidManifest.xml``
like any other service.

Taking the ``Movies`` service example defined in the previous section, a 
``MoviesService`` class will be generated which we can register as folows:

.. code-block:: xml

   <service
      android:name="com.robotoworks.example.movies.ops.MoviesService"
      android:exported="false" >
   </service>

The format of the generated Android ``Service`` would be ``{package_name}{service_name}Service``,
where ``{package_name}`` is the name of the package element in your service definition,
and likewise, ``{service_name}`` is the name of your service, in our case, ``Movies``.
   
Defining Operations
-------------------
Defining Operations with |mechops| is similar to defining methods in java, with
the exception that |mechops| only supports primitives and ``Parcelable`` for
operation arguments, for example:

.. code-block:: mechops

   package com.robotoworks.example.movies.ops
   
   service Movies {
      operation getMovies()
      operation addMovie(String title, String description, int year)
   }
   
The example defines two operations, and argumentless ``getMovies()`` operation, 
and a ``addMovie(...)`` operation with arguments.

Operation Uniqueness
--------------------
By default, when using the generated Operation Service API, all operations
are unique.

An operation that is unique is an operation where only one of its kind can
exist in the background queue, or one that is currently executing.

An operation is considered unique if it is of the same signature, for instance
``addMovie(String, String, int)`` and has the same argument values, for instance,
we can use the generated API to execute operations:

.. code-block:: java

   MoviesServiceBridge service = MoviesServiceBridge.getInstance();
   
   int op1 = service.executeAddMovieOperation("The Godfather", "Movie about gangstas.", 1972);
   int op2 = service.executeAddMovieOperation("The Godfather", "Movie about gangstas.", 1972);

If an operation is unique, in the example above, executing the second operation
would return the same result (operation id), if the first operation is in the queue
or currently executing, such that ``op1 == op2``.

We can specify that an operation should not be unique, with the ``not unique``
keyword, for instance:

.. code-block:: mechops

   package com.robotoworks.example.movies.ops
   
   service Movies {
      operation getMovies()
      operation addMovie(String title, String description, int year) not unique
   }
   
Executing the same operation in succession that is ``not unique`` will always
be added to the queue.

Sometimes we just want an operation to be partially unique, we can do this
by specifying a unique clause and a list of arguments that make it unique,
for instance, we can make the ``addMovie(...)`` operation unique by its title.

.. code-block:: mechops

   package com.robotoworks.example.movies.ops
   
   service Movies {
      operation getMovies()
      operation addMovie(String title, String description, int year) unique(title)
   }

Executing this operation, will only be added to the queue if an operation is
not currently in the queue with the same title, or currently executing with
the same title.

We can specify many arguments that make an operation unique in a comma seperated 
list, for instance:

.. code-block:: mechops

   operation addMovie(String title, String description, int year) unique(title, year)

Implementing Operations
-----------------------
For each operation defined in the |opsvcdef|, a class stub is generated, with
the format of the class name as ``{operation_id}Operation`` where ``operation_id``
is the identifier given to the operation, ie:- ``getMovies`` becomes ``GetMoviesOperation``.

.. warning:: 
   Currently, when renaming operations, a new stub is generated which would make 
   the old stub cause a compile error, if you have implemented a stub, and want to
   keep the code then you should copy it into the new stub
   
The following example shows the generated stub for ``GetMoviesOperation``:

.. code-block:: java

   public class GetMoviesOperation extends AbstractGetMoviesOperation {
      @Override
      protected Bundle onExecute() {
         // TODO Auto-generated method stub
         return null;
      }
   }
   
When we implement operations, we add code to the ``onExecute()`` method, and
return a ``Bundle`` that represents a result.

The ``Bundle`` we return should be constructed with the Mechanoid API method, 
|jdoc| :java:extdoc:`Operation.createOkResult()  <com.robotoworks.mechanoid.ops.Operation.createOkResult()>` to
indicate that the operation was successful, or |jdoc| :java:extdoc:`Operation.createErrorResult(Throwable)  <com.robotoworks.mechanoid.ops.Operation.createErrorResult(java.lang.Throwable)>` 
to indicate that an error occurred.

The following example shows how we could implement the ``onExecute()`` of
the ``GetMoviesOperation`` stub.

.. code-block:: java

   @Override
   protected Bundle onExecute() {
      
      MoviesApiClient client = MoviesApplication.getMoviesApiClient();
      
      try {
         Response<GetMoviesResult> response = client.getMovies();
         
         // Throws UnexpectedHttpStatusException if not 200 OK 
         response.checkResponseCodeOk();
         
         GetMoviesResult result = response.parse();
         
         saveMovies(result.getMovies());
         
         return Operation.createOkResult();
         
      } catch (Exception e) {
         Log.e(TAG, Log.getStackTraceString(e));
         
         return Operation.createErrorResult(e);
      }
   }

The example demonstrates how we call a REST client and how we should construct 
the result, as previously outlined, if everything is ok, we return 
``Operation.createOkResult()``, in the event of an error we return 
``Operation.createErrorResult(Throwable)``.

Operations with arguments, such as the ``addMovie(...)`` operation we saw earlier,
make their arguments available to the operation stub through properties, for instance
given the operation:

.. code-block:: mechops

   operation addMovie(String title, String description, int year) 

We can access the arguments in ``onExecute()`` as follows:

.. code-block:: java

   @Override
   protected Bundle onExecute() {
      
      // We can get arguments like this:
      String title = getTitle();
      String description = getDescription();
      int year = getYear();
      
      ...
   }
   

