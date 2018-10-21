[![GitHub license](https://img.shields.io/badge/license-Apache%20Version%202.0-blue.svg)](https://github.com/sbrukhanda/fragmentviewpager/blob/master/LICENSE.txt)
[![Build Status](https://travis-ci.org/hannesa2/mechanoid.svg?branch=master)](https://travis-ci.org/hannesa2/mechanoid)
[![](https://jitpack.io/v/hannesa2/mechanoid.svg)](https://jitpack.io/#hannesa2/mechanoid)


Mechanoid with Gradle  support
=============

Mechanoid is an Eclipse Plugin sporting a set of code generators for Android™ driven by Simple DSL's (Domain Specific Languages) with full Eclipse Editor Support for the rapid development of Android applications.

But since Android uses as IDE Intellij (Android Studio) the code generation doesn't work any more. But some old project still uses this generated 
code and have to fix some issues. Unfortunatelly the original maintainer seams to be not interesed any more. 

This is the motivation for this fork  


Mechanoid DB
------------
Here Room from Google is a modern replacement and there is [secure Room](https://github.com/commonsguy/cwac-saferoom) as well 

Mechanoid Net
-------------
Retrofit with Rx is a good replacement

Mechanoid Ops
-------------
This is the part why I maintain this repo because I've no good replacement found. Any suggestion is welcome

Mechanoid Prefs
---------------
Here I use secure [DBPReferences](https://github.com/hannesa2/DbPreferences) as replacement

Installation
============
Repository available on https://jitpack.io

```Gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
```Gradle
dependencies {
    implementation 'com.github.hannesa2:mechanoid:3.1' // Support Lib
    // or
    implementation 'com.github.hannesa2:mechanoid:4.0' // Android X
}

```


License
=======

Mechanoid Runtime Library
-------------------------

    Copyright 2013 Robotoworks Limited

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

Eclipse Plugin Components
-------------------------

    Copyright 2013 Robotoworks Limited
    
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the Eclipse Public License v1.0
    which accompanies this distribution, and is available at
       
       http://www.eclipse.org/legal/epl-v10.html
