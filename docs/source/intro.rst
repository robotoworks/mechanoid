Introduction
============
Mechanoid is an Eclipse Plugin sporting a set of code generators for Android™ driven by DSL's (Domain Specific Languages) 
with full Eclipse Editor Support for the rapid development of Android applications.

Mechanoid is currently composed of four generators.

* **Mechanoid DB** for generating Android Content Providers backed by generated SqliteOpenHelper's
* **Mechanoid Net** for generating JSON over REST clients
* **Mechanoid Ops** providing a framework to run decoupled background operations
* **Mechanoid Prefs** for generating Shared Preference wrappers

This documentation will cover each generator as seperate topics.

Prerequisites
-------------
The following points outline the requirements of Mechanoid.

* The plugin is developed and tested with Eclipse Juno and has not been tested with previous versions.
* The Mechanoid generated source code requires the Mechanoid Library Jar which is compatible with Android API Level 8 and upwards.
* The Mechanoid generated source requires the Android SDK and is only known to work with Android Projects and Android Library Projects.

Credits
-------
Mechanoid is currently developed under an open source Android company, Robotoworks Limited.

Mechanoid is built on top of the powerful xText Framework, a language development environment for Eclipse that provides 
first class language features such as syntax highlighting, validation and content assist.