Introduction
============
Mechanoid is an Eclipse Plugin sporting a set of code generators for Android™ 
driven by DSL's (Domain Specific Languages) with full Eclipse Editor Support 
for the rapid development of Android applications.

Code Generators
---------------
Mechanoid is currently composed of four generators, each code generator focuses
on specific components of an Android application.

Each code generator comes with first class Eclipse editor support including
syntax highlighting, content assist and validation thanks to the powerful 
xText Language Framwork.

The following sections briefly describe the purpose of each generator.

|mechdb|
""""""""
|mechdb| is a code generator driven by the Sqlite grammar itself, with some
extra constructs to define schema migrations, |mechdb| generates a
Content Provider API from directly from sql creational statements such 
as **create table** and **create view**.

|ref| See the :doc:`Mechanoid DB Documentation </db/index>`

|mechnet|
"""""""""
|mechnet| is a simple DSL to define JSON over REST clients. |mechnet| will
generate a REST Client API from your definition, using the request/reply 
pattern.

|mechops|
"""""""""
|mechops| is a DSL to define
providing a framework to run decoupled background operations

|mechprefs|
"""""""""""

for generating Shared Preference wrappers