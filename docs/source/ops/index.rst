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

.. _operation-uniqueness:

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
is the identifier given to the operation, ie:- ``getMovies()`` becomes ``GetMoviesOperation``.

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
|jdoc| :java:extdoc:`Operation.createOkResult() <com.robotoworks.mechanoid.ops.Operation.createOkResult()>` to
indicate that the operation was successful, or 
|jdoc| :java:extdoc:`Operation.createErrorResult(Throwable) <com.robotoworks.mechanoid.ops.Operation.createErrorResult(java.lang.Throwable)>` 
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
   
Executing Operations
--------------------
Most commonly operations will be executed from the UI such as an ``Activity``
or ``Fragment``, the best way to manage operations from the UI is with
the |jdoc| :java:extdoc:`OperationManager <com.robotoworks.mechanoid.ops.OperationManager>` 
(or |jdoc| :java:extdoc:`OperationManager <com.robotoworks.mechanoid.ops.SupportOperationManager>` for backward compatibility).

Executing operations are always performed with an implementation of ``OperationServiceBridge`` 
described in the next section.

The Service Bridge
""""""""""""""""""
Every |opsvcdef| results in a generated implementation of 
|jdoc| :java:extdoc:`OperationServiceBridge <com.robotoworks.mechanoid.ops.OperationServiceBridge>`  
for instance ``MoviesServiceBridge``.

The bridge acts as a proxy to the service (eg:- ``MoviesService``). It is responsible
for constructing service intents, handling operation uniqueness, and also dispatching
callbacks to registered instances of ``OperationServiceListener``.

By default bridges are generated as singletons, in order for a bridge to work
correctly it must either be a singleton or created in a way that makes a single
instance accessible (ie:- managed by a dependency container), for example, we 
can get an instance of the ``MoviesServiceBridge`` like this:

.. code-block:: java

   MoviesServiceBridge bridge = MoviesServiceBridge.getInstance();

Once we have an instance of a bridge, we gain access to the methods we defined
in our |opsvcdef|, the following example shows how we can use the bridge to
execute these operations:

.. code-block:: java

   MoviesServiceBridge bridge = MoviesServiceBridge.getInstance();
   
   int operationId = service.executeAddMovieOperation("The Godfather", "Movie about gangstas.", 1972);
   
The method ``executeAddMovieOperation(...)`` is the generated version of
the method we defined in our |opsvcdef| earlier ``addMovie(...)``.

Every operation always returns an operation request id, for each new operation an 
incrementing id is assigned that uniquely identifies a request, with the exception 
of operation uniqueness (see |ref| :ref:`operation-uniqueness`) where the same
id could be returned for a pending or currently executing operation.

.. topic:: The Request ID
   
   Executing operations with the bridge happens asynchronously, behind the scenes
   a request to execute the operation is put into a queue managed by an ``OperationProcessor``.
   The operation processor is responsible for taking the next operation from the
   queue and executing it until no operations are left to process.
   
   With this in mind, when we invoke an ``execute`` method on a bridge, we
   get a **request id** back, which we can use to uniquely identify an operation.
   
   In order to know what is happening with an operation, we rely on callbacks 
   discussed later.
   
The Operation Manager
"""""""""""""""""""""
As previously mentioned when executing operations from a UI class such as 
an ``Activity`` or a ``Fragment`` we can use the ``OperationManager``, or, the ``SupportOperationManager``
if we want backward compatibility.

This section shows examples using the ``SupportOperationManager``.

The Operation Manager allows us to easily handle operation callbacks and lifecycle
in much the same way the Android Loader API does.

we must first represent each operation we want to execute with a unique integer constant,
for instance:

.. code-block:: java

   public class MovieListFragment extends ListFragment {
   
      private static final int OP_GET_MOVIES = 1;
      
   ...
   
We can then define an instance of an Operation Manager, an Operation Manager
is responsible for managing a single |opsvc|, the following example shows
how we can manage our Movies |opsvc|:

.. code-block:: java

   private SupportOperationManager<MoviesServiceBridge> mOperationManager;

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      mOperationManager = SupportOperationManager
            .create(getFragmentManager(), 
                  MoviesServiceBridge.getInstance(),
                  mOperationManagerCallbacks);
      
      mOperationManager.runOperation(OP_GET_MOVIES, false);
   }
   
In the example we construct a new ``SupportOperationManager<MoviesServiceBridge>`` in
a fragments ``onCreate(Bundle)`` method, this is important since the manager needs
to be introduced early into an activity or fragments lifecycle.

The last statement uses the manager to run an operation that we represent as 
``OP_GET_MOVIES``, the second argument tells the manager if we should force the operation
to run, by providing the value of ``false`` means to only run the operation if
it has not yet been run.

The field, ``mOperationManagerCallbacks`` refers to a callback instance defined
in the fragment that is responsible for actually running the operation as follows:

.. code-block:: java

   private OperationManagerCallbacks<MoviesServiceBridge> mOperationManagerCallbacks
      = new OperationManagerCallbacks<MoviesServiceBridge>() {

      @Override
      public void onOperationComplete(MoviesServiceBridge bridge, int id, Bundle result, boolean fromCache) {
      }

      @Override
      public int createOperation(MoviesServiceBridge bridge, int id) {
      
      }
      
      @Override
      public void onOperationPending(MoviesServiceBridge bridge, int id) {
      }
   };
   
For each operation we want to execute we must implement at least ``onOperationComplete(...)`` 
and ``createOperation(...)``.

To implement ``createOperation(...)`` we simply use the bridge to execute the
operation for the id we used to represent it:

.. code-block:: java

   @Override
   public int createOperation(MoviesServiceBridge bridge, int id) {
      if(id == OP_GET_MOVIES) {
         return bridge.executeGetMoviesOperation();
      }
      
      return -1;
   }

In the example we use the bridge to execute the ``GetMoviesOperation`` via
``executeGetMoviesOperation()`` if the id matches ``OP_GET_MOVIES`` returning the 
result, in any other case we simply return -1 to indicate that there is no match.
 
.. warning::
   It is important here to not get confused request ID we return from executing
   an operation on the bridge with the value we gave ``OP_GET_MOVIES`` since this
   ID is managed by us and needed so the ``OperationManager`` can track the requests
   according to the life-cycle of an ``Activity`` or ``Fragment``.
   
The ``onOperationComplete(...)`` callback gives us an opportunity to examine and act
upon the completion of an operation, typically binding data or showing an error,
for example:

.. code-block:: java

   @Override
   public void onOperationComplete(MoviesServiceBridge bridge, int id, Bundle result, boolean fromCache) {
      if(id == OP_GET_MOVIES) {
         if(Operation.isResultOk(result)) {
            
            getLoaderManager().initLoader(LOADER_MOVIES, null, mLoaderCallbacks);
            
         } else {
            Throwable error = Operation.getResultError(result);
            
            Toast.makeText(getActivity(), error.getMessage(), Toast.LENGTH_LONG).show();
         }
      }
   }

In the example, we first check the ``id`` argument is an ``OP_GET_MOVIES``, if so
we know that the completing operation is the one that we executed, we can then
check the result with the helper 
:java:extdoc:`Operation.isResultOk(Bundle) <com.robotoworks.mechanoid.ops.Operation.isResultOk(android.os.Bundle)>`, 
if ok, we can then perform actions based on an OK result, such as initializing a loader
as in the example, or, if the result is not OK, we can use the helper 
:java:extdoc:`Operation.getResultError(Bundle) <com.robotoworks.mechanoid.ops.Operation.getResultError(android.os.Bundle)>` to
extract the error from the Bundle, and act on the error.


 