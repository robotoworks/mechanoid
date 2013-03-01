|mechprefs|
===========
.. note:: 
   You must install the Mechanoid Plugin before you can use |mechprefs|.
   |ref| See :doc:`/start`
   
|mechprefs| provides a simple way to access Android Shared Preferences. Rather
than access your preferences by constants or hand-rolling a wrapper to access
them, |mechprefs| provides a simple language (DSL) that can be used to
define a set of preferences that can be accessed in consistent.

The following example shows the standard way of accessing preferences:

.. code-block:: java

   SharedPreferences prefs = getSharedPreferences("name_of_prefs", 0);
   
   prefs
      .edit()
      .putString("UserName", "Joe Bloggs")
      .putInt("Age", 25)
      .commit();
   
   String name = prefs.getString("UserName", null);
   int age = prefs.getInt("Age", 0);

Access to preferences this way requires us to specify the name of the preferences
we want to retreive and also we have to access them using keys, we can make
it look nicer by using constants but generally it is error prone and the
better way is to write a wrapper.

With |mechprefs| after writing our Preferences Definition access to preferences
will look like this:

.. code-block:: java

   UserPreferences prefs = UserPreferences.getInstance();
   
   prefs
      .edit()
      .putName("Joe Bloggs")
      .putAge(25)
      .commit();
   
   String name = prefs.getName();
   int age = prefs.getAge();
   
We can see that working with preferences with |mechprefs| are less error prone 
and share the same design for editing, committing and accessing preferences.

The |mechprefs| File
--------------------
We define our preferences in a file with the extension ``mechprefs``,
for instance ``User.mechprefs``.

We can create a mechprefs file using the |mechprefs| File Wizard. In eclipse go to
``New > Other > Mechanoid > Mechanoid Prefs File``, the |mechprefs| wizard will
launch:

.. figure:: /images/screens/wizard-mechprefs.png

The following should be considered when providing values for the wizard.

* **Folder** is where you want to create the file typically ``/project/models`` 
  is a good place to keep your Mechanoid Files.
* **Package** is where you want to generate the code, all code will be generated 
  to the given java package.
* **Name** is the name of your preferences definition, this name will be used as a 
  prefix for your generated Preferences class such as UserPreferences.
  
On completing the wizard, a new file will be created, the contents will
contain an empty service definition:

.. code-block:: mechprefs

   package com.robotoworks.example.prefs
   
   preferences User {
      
   }
   
The Preferences Definition
--------------------------
Preferences are defined in a ``preferences`` block followed by a unique name
to identify a set of preferences. Inside the block we define simple key:type
pairs where type can be any of the types supported by the underlying preferences
such as ``String``, ``long``, ``int``, ``float`` and ``boolean``.

The following example shows how we might define a set of ``User`` preferences.

.. code-block:: mechprefs

   package com.robotoworks.example.prefs
   
   preferences User {
      UserId:long
      Name:String
      Age:int
      BankBalance:float
      Subscribed:boolean
   }
   
We can provide default values to any preference in the definition providing
it is compatible with the type, for example:-

.. code-block:: mechprefs

   preferences User {
      UserId:long = 0
      Name:String
      Age:int
      BankBalance:float = 100.0
      Subscribed:boolean = true
   }
   
Accessing Preferences
---------------------
Once we write our preferences definition, a class will be generated that provides
an easy way to access them, the format of the generated class will be 
``{preferences_definition_name}Preferences`` where ``{preferences_definition_name}`` 
will be the unique name we gave our preferences earlier, for instance ``User``.

The following example shows how we can access preferences from the
generated ``UserPreferences``.

.. code-block:: mechprefs

   UserPreferences prefs = UserPreferences.getInstance();
   
   String name = prefs.getName();
   int age = prefs.getAge();
   
In the example we use the ``getInstance()`` method for our ``UserPreferences``. 
|mechprefs| and then we can use any of the ``get`` methods to access the preferences
we described in the definition.

Persisting Preferences
----------------------
Preferences are persisted in much the same way standard shared preferences are
persist using a preference editor.

The following example shows how we can do this with our generated preferences
class:

.. code-block:: mechprefs

   UserPreferences prefs = UserPreferences.getInstance();
   
   prefs
      .edit()
      .putName("Joe Bloggs")
      .putAge(25)
      .commit();
   
THe example shows that once we have a reference to our preferences we can use
the ``edit()`` method to access the editor, use any of the ``put`` methods
to change our preferences, and then finish off with a ``commit()`` in much
the same we we would do with the shared preferences.

Preference Change Listeners
---------------------------
The generated preferences class provides two methods for registering and 
unregistering preference changed listeners, in the same way the underlying
shared preferences do.

From the generated class we can use 
``registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener)`` 
and ``unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener)``
to register and unregister listeners respectively.

