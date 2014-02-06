.. _contents:

Mechanoid Documentation
=======================
Mechanoid is an Eclipse Plugin sporting a set of code generators for Android™ 
driven by DSL's (Domain Specific Languages) with full Eclipse Editor Support 
for the rapid development of Android applications.

Installation
------------
To download and install Mechanoid, see |ref| :doc:`/start`.

Components
----------
Mechanoid is currently composed of four code generators. Each code generator 
focuses on specific components of an Android application.

Each code generator comes with first class Eclipse editor support including
syntax highlighting, content assist and validation thanks to the powerful 
|link| `xText Language Framework <http://www.eclipse.org/Xtext/>`_.

The following sections briefly describe the purpose of each generator.

.. container:: row-fluid

   .. container:: span5 offset1
   
      .. rubric:: |mechdb|
      
      |mechdb| is a code generator driven by the Sqlite grammar itself, with some
      extra constructs to define schema migrations, |mechdb| generates a
      Content Provider API from directly from sql creational statements such 
      as **create table** and **create view**.
      
      |ref| See the :doc:`Mechanoid DB Documentation </db/index>`
   
   .. container:: span5

      .. rubric:: |mechnet|
      
      |mechnet| is a simple DSL to define JSON over REST clients. |mechnet| will
      generate a REST Client API, entities, and entity serializers/deserializers from 
      your definition.
      
      |ref| See the :doc:`Mechanoid Net Documentation </net/index>`

.. container:: row-fluid

   .. container:: span5 offset1
   
      .. rubric:: |mechops|
      
      |mechops| is a DSL to define decoupled background operations, which are useful
      when making network requests or long running tasks from activities and
      fragments, |mechops| is designed around the pattern described by 
      Virgil Dobjanschi in the Google IO 2010 REST Presentation.
      
      |ref| See the :doc:`Mechanoid Ops Documentation </ops/index>`

   .. container:: span5

      .. rubric:: |mechprefs|
      
      |mechprefs| is possibly the simplest DSL in the set, it allows you to
      define and generate Shared Preference wrappers that make preferences
      easier to work with in code.
      
      |ref| See the :doc:`Mechanoid Prefs Documentation </prefs/index>`

Mechanoid Library Documentation
-------------------------------
The Mechanoid Library is a jar file that provides common base code for generated
code.

|ref| See the Javadoc for more details: http://robotoworks.com/mechanoid/doc/apidocs 
 
Help and Support
----------------
Mechanoid is still a work in progress so it is highly likely you will encounter 
issues and limitations, please log issues on the github project page 
https://github.com/robotoworks/mechanoid/issues

To discuss Mechanoid use the Google Group 
https://groups.google.com/forum/#!forum/android-mechanoid-plugin

You could ask a question on Stack Overflow 
http://stackoverflow.com/questions/ask?tags=Android+Mechanoid

Also, you could read the Robotoworks Blog http://robotoworks.com/blog

Documentation Contents
----------------------

.. toctree::
   :maxdepth: 3
   
   self
   start
   db/index
   net/index
   ops/index
   prefs/index
   credits