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

   client BookServiceClient "http://books.robotoworks.com" {
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
   
   package com.robotoworks.example.books.net
   
   client BookServiceClient "http://books.robotoworks.com" {

   }

.. _defining-methods:

Defining Methods
----------------
|mechnet| currently supports GET, PUT, POST and DELETE HTTP methods, to define
methods we create method blocks in the service client using the ``get``, ``put``, 
``post`` and ``delete`` keywords, for instance, the following defines a get
method:

.. code-block:: mechnet

   client BookServiceClient "http://books.robotoworks.com" {
       get getBooks /books {

       }
   }
   
Similarly we can define methods for other HTTP methods. Looking at the example
above, we can see that for each method, we must give an identifier, such as
``getBooks`` in the example, followed by a relative path (action), ie:- ``/books``.

Inside method blocks we can add blocks to define, ``body``, ``response``, 
``params`` and ``headers`` where ``body`` blocks are only applicable for 
``put`` and ``post`` methods, each block type will be discussed in over the next
sections.

``body`` and ``response`` blocks can either define an anonymous block of data,
or a reference to an entity.

For instance, we can define an anonymous response like this:-

.. code-block:: mechnet

   get getBook /book/id:long {
      response {
         id:long,
         title:String,
         description:String
      }
   }
   
Where the response block defines that a JSON object will be returned similar to
this:-

.. code-block:: json

   {
      "id":123,
      "title":"Musashi",
      "description":"Eiji Yoshikawa",
      "author":Author
   }
   
Or, we can define the response to map to an entity like this:-

.. code-block:: mechnet

   get getBook /book/id:long {
      response Book
   }

Where ``Book`` would be defined elsewhere. Entities are described in later sections,
they are a means to remove code duplication and define JSON graphs which may
be returned from some services.

The following example provides a more complete definition of an imaginary Book
service client.

.. code-block:: mechnet

   package com.robotoworks.example.books.net
   
   entity generate Book {
      id:long,
      title:String,
      description:String
   }
   
   client BookServiceClient "http://books.robotoworks.com" {
      get getBooks /books {
         response Book[]
      }
      
      get getBook /books/id:long {
         response Book
      }
      
      put updateBook /books {
         body Book
         response {
            success:boolean,
            status_message:String
         }
   
      }
      
      post createBook /books {
         body Book
         response {
            success:boolean,
            status_message:String,
            book_id:int
         }
      }
      
      delete deleteBook /books/id:long {
         response {
            success:boolean,
            status_message:String
         }
      }
   }

Using the generated API that this definition would produce would look like the 
following:

.. code-block:: java

   BookServiceClient client = new BookServiceClient();
    
   Book book = new Book();
   book.setAuthor("Eiji Yoshikawa");
   book.setTitle("Musashi");
    
   Response<CreateBookResult> response = client.createBook(new CreateBookRequest(book));
    
   if(response.getResponseCode() != 200) {
       throw new Exception("Invalid response!");
   }
    
   CreateBookResult result = response.parse();
    
   int newBookId = result.getBookId();

The Base URL
------------
When we define a service client with |mechnet| we can provide a Base URL, for
example:

.. code-block:: mechnet

   client BookServiceClient "http://books.robotoworks.com" {

   }
   
In the example we define the base URL as ``http://books.robotoworks.com``. By doing
so when we use the generated API we do not need to specify it during construction:

.. code-block:: java

   BookServiceClient client = new BookServiceClient();
   
In either case we can provide a Base URL during construction as follows:

.. code-block:: java

   BookServiceClient client = new BookServiceClient("http://books.robotoworks.com");
   
The Base URL should not end in a slash since this would clash when we define
method actions, next.

Actions
-------
When we define methods (see |ref| :ref:`defining-methods`), we define an action,
where an action is the part of the URL that follows the base URL, for example:-

.. code-block:: mechnet

   get getBooks /books {
      response Book[]
   }
 
Above the action for the ``getBooks`` method is ``/books``.

Actions can be any number of segments long seperated by slashes, such as
``/book-service/v1/books``.

Ultimately when using a generated service client, the client will prepend
the base URL, ie:- ``http://books.robotoworks.com/book-service/v1/books``

Actions can have parameterized segments, for instance, consider the following URL:

``http://books.robotoworks.com/books/123``

The final segment ``123`` defines an id, we can define this as a parameterized
segment for our ``getBook`` method:

.. code-block:: mechnet

   get getBook /books/id:long {
      response Book
   }

The format for a parameterized segment is ``segement_name:type`` where ``type`` 
could be either String, long, int, boolean, double or any of the supported 
primitive types.

Using the generated service client will require us to provide the id parameter 
as follows-:

.. code-block:: java

   BookServiceClient client = new BookServiceClient("http://books.robotoworks.com");
   
   Response<GetBookResponse> response = client.getBook(new GetBookRequest(123));
 
URL Parameters
--------------
URL parameters or query strings can be defined by adding a ``params`` block to
any method definition.

For example we can add a ``offset`` and ``limit`` parameters to our ``getBooks``
service method:

.. code-block:: mechnet

   get getBooks /books {
      params offset:int, limit:int
      response Book[]
   }
   
The parameters would then be available in the generated client:

.. code-block:: java

   BookServiceClient client = new BookServiceClient("http://books.robotoworks.com");
   
   GetBooksRequest request = new GetBooksRequest();
   request.setOffsetParam(10);
   request.setLimitParam(100);

   Response<GetBookResponse> response = client.getBooks(request);

We can also specify that a parameter should have a default value, for instance
we can set a default of 100 on the ``limit`` param:

.. code-block:: mechnet

   get getBooks /books {
      params offset:int, limit:int=100
      response Book[]
   }

Parameters can also be defined on the client, if we define parameters on the client
then all methods will include those parameters, for instance we can define
an ``api_token:String`` parameters on the ``BookServiceClient``:

.. code-block:: mechnet

   client BookServiceClient "http://books.robotoworks.com" {
   
      params api_token:String
      
      get getBooks /books {
         params offset:int, limit:int=100
         response Book[]
      }
   }

We can then set this parameter on an instance of the generated service client:

.. code-block:: java

   BookServiceClient client = new BookServiceClient();
   client.setApiTokenParam("abcd1234");
   
The ``api_token`` parameter will then be added to every service method for this
client, however we can still override it for a specific method, for instance:

.. code-block:: java

   BookServiceClient client = new BookServiceClient("http://books.robotoworks.com");
   client.setApiTokenParam("abcd1234");
   
   GetBooksRequest request = new GetBooksRequest();
   
   // override the api_token for this request
   request.setApiTokenParam("wxyz6789");
   
   Response<GetBookResponse> response = client.getBooks(request);
   
HTTP Headers
------------
Default HTTP header values can be set for a client, or for a method.

The following example shows how to define headers at the client level.

.. code-block:: mechnet

   client BookServiceClient "http://books.robotoworks.com" {
       headers
           "Accept-Language":"en-GB",
           "Accept-Charset":"utf-8"
    
       get getBooks /books {
           response Book[]
       }
   }

The next example shows how to set headers at the method level, headers defined 
at the method level will override those at the client level.

.. code-block:: mechnet

   client BookServiceClient "http://books.robotoworks.com" {
   
       get getBooks /books {
           headers
               "Accept-Language":"en-GB",
               "Accept-Charset":"utf-8"
               
           response Book[]
       }
   }

Headers can also be defined in the generated API, for instance we can set
headers on the client as follows:

.. code-block:: java

   BookServiceClient client = new BookServiceClient();
   client.setHeader("abcd1234");

when we define default headers in a client definition, they will be assigned during 
construction, if we set them on an instance of a generated client as in the above
example they will override the default headers for that given client instance.

Body and Response Blocks
------------------------
As described previously The body of a ``PUT`` or ``POST`` request can be defined with 
the ``body`` keyword, similarly, the response of all requests can be defined with 
the ``response`` keyword.

A body or response can be defined in a few ways, outlined below.

Anonymous Blocks
""""""""""""""""
A body or response block can be defined as a braced block of name:type pairs, 
in both cases, the result of the JSON will be that of a JSON object.

Given the following example of a post method definition:

.. code-block:: mechnet

   post createBook /books {
       body {
           title:String,
           author:String
       }
       response {
           success:boolean,
           status_message:String,
           book_id:int
       }
   }
   
An example of the expected JSON for the body would be:-

.. code-block:: json

   {
      "title":"Musashi",
      "author":"Eiji Yoshikawa"
   }

And an example for the response JSON would be:-

.. code-block:: json

   {
      "success":true,
      "status_message":"Book created.",
      "book_id":123
   }

Blocks with entities
""""""""""""""""""""
Rather than define an anonymous entity as the body or response, it is often
more beneficial to define them as entities like we saw earlier with ``Book`` 
entity.

The following example shows how we can use an entity for the body:-

.. code-block:: mechnet

   post createBook /books {
       body Book
       response {
           success:boolean,
           status_message:String,
           book_id:int
       }
   }

In the example we show that body expects the entity ``Book``, entities are defined
using the ``entity`` keyword:

entity BaseBookResult {
    success:boolean,
    status_message:String
}
Then we can update the code to extend the response.

1
2
3
4
5
6
post createBook /books {
    body Book
    response extends BaseBookResult {
        book_id:int
    }
}
This helps us reduce repetition and allows us to share common response parameters amongst all responses that extend the same base response.

Blocks with primitives

Its also possible to use primitives in blocks, such as String, int, boolean, etc.

1
2
3
get getBookTitle /books/id:long {
    response String
}
This example response returns only a String, its not possible to extend a base response when doing this.

Blocks with arrays

The DSL allows responses to return arrays of primitives or entities by using the [] array notation, generated code will always generated to lists when defining arrays.

1
2
3
4
5
6
get getAllBookTitles /books {
    response String[]
}
get getBooks "/books" {
    response Book[]
}
Consuming superflous nesting

Sometimes JSON comes badly structured, in order to get around this we can skip into JSON objects effectively flattening nested hierarchies.

Consider the following JSON response.

1
2
3
4
5
6
7
8
{
    "result": {
        "books":[
            {"id":1, "title":"Musashi", "author":"Eiji Yoshikawa"},
            {"id":2, "title":"A Still Forest Pool", "author":"Achaan Chah"}
        ]
    }
}
In this response, we can consider the JSON object “result” is superflous, in order to consume this result we would need to create a wrapper entity Result:-

1
2
3
4
5
6
7
8
9
10
11
entity generate Result {
    books:Book[]
}
1
 
We can then make our method return the result:
 
1
get getBooks /books {
    response Result
}
Then to access the list of books in the response in the generated code:-

1
2
3
Response<GetBooksResponse> response = client.getBooks(new GetBooksRequest());
GetBooksResponse content = response.parse();
List<Book> books = content.getResult().getBooks();
This is not desirable since result is nothing but a wrapper for books, we can get around this issue by wrapping the books array in a block with the name result as follows:-

1
2
3
4
5
6
7
get getBooks /books {
    response {
        result {
            books:Book[]
        }
    }
}
This makes our generated response code much easier to use by reducing verbosity in the JSON and avoiding creating unnecessary entity definitions purely to support this structure.

In order to see the affect the generated code is as follows.

1
2
3
Response<GetBooksResponse> response = client.getBooks(new GetBooksRequest());
GetBooksResponse content = response.parse();
List<Book> books = content.getBooks();
This is much cleaner and also works with entities.

Debugging Requests/Responses

By default generated Mechanoid Net service clients do not log network requests, to enable logging service clients are generated with constructors with an argument to enable logging. The following example shows how to enable logging for the book service.

1
BookService service = new BookService(BuildConfig.DEBUG);
In the example we use the Android BuildConfig.DEBUG flag (generated by the Android ADT Plugin) to enable logging on the BookService client.

Once logging is enabled, all requests and responses will be logged.

Logging can product an extra performance overhead since input/output streams needs to be parsed twice, logging should be disabled in production builds of your applications.
