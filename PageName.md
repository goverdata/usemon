# Introduction #

Usemon is built using Maven 2. We have several 3rd. party dependencies which must be made available.

# Details #

When compiling for the first time, the following artifacts will appear as unresolved:

> | **Component**  | **Download from**                               |
|:---------------|:------------------------------------------------|
> | jcommons       | http://sourceforge.net/projects/jfreechart/     |
> | jfreechart     | http://sourceforge.net/projects/jfreechart/     |
> | gwt-ext        | http://code.google.com/p/gwt-ext/               |


## How to install an artifact into your local maven repository ##

  1. Download the artifact and save the .jar file in a temporary directory
  1. Install the artifact into your local repository using this command:
```
mvn install:install-file -DgroupId=jfree -DartifactId=jcommon \
-Dversion=1.0.12 -Dpackaging=jar \
-Dfile=jcommon-1.0.12.jar -DgeneratePom=true 
```