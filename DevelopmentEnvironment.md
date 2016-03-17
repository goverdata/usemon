# Introduction #
This document describes in detail how to check out and get Usemon to build on your local development machine.

# Prerequisits #
The developers of Usemon uses Eclipse as their IDE, and we recommend others that plan to develop or build Usemon to do the same. The reason for this is that all the documentation is written with this as base reference.

We are currently using Eclipse version 3.3.1.1

## Required Eclipse plugins ##
  * M2Eclipse: http://m2eclipse.codehaus.org/update/
  * Subclipse: http://subclipse.tigris.org/update_1.2.x/

# Checking out from SVN #

The safest way to do this is to do it by following this list of tasks:
  * Check out `usemon-pom` (Do **not** use checkout as Maven project)
    * Comment out the module tags inside the modules section from the `pom.xml`
    * Execute `Run As -> Maven Build...`, Goal: "clean install"
    * Uncomment the modules again
  * Check out the rest of the modules (Do **not** use checkout as Maven project)
  * Click {{Enable Dependency Management}} and then `Updated Source Folders` from the Maven menu on all projects

## Resolving dependencies ##
When you've successfully completed the above steps you'll have one unresolved dependency in the `usemon-gwt-web` module. You must download and install gw-ext version 0.9.4 to your local maven2 repository.

|gwt-ext|http://code.google.com/p/gwt-ext/|
|:------|:--------------------------------|

Install using this command
```
mvn install:install-file -DgroupId=com.google.code.gwtext -DartifactId=gwtext \
-Dversion=0.9.4 -Dpackaging=jar -DgeneratePom=true Dfile=gwtext.jar
```