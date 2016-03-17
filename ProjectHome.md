Usemon is a monitoring system for usage trends, response time and dependency analysis of plain Java applications or big multi-clustered Java Enterprise applications running in production. The proof of Usemon's stability and usefulness is confirmed by the fact that one of the worlds largest telecom operators is running Usemon in a clustered WebSphere environment with over 90 enterprise applications.

The Usemon system consists of three separate components:

# Usemon Agent #

The agent performs byte code manipulation of interesting classes, injecting statistics gathering code in all public methods of classes like EJBs, MDBs, SQL statements, Queue senders or configured POJOs for that matter.

Data is collected in intervals of 60 seconds and transmitted to the collector for storage into a SQL database.

The data is transmitted using UDP multicasts.

Visit the Usemon InstallGuide page for installation instructions.

# Usemon Collector #

The Usemon Collector receives the data from the Usemon Agents, transforms the observations and stores them into the SQL database. The data model of the database is based upon a star scheme or a dimensional model if you like and allow very fast slice and dicing of the information.

## Dimensional data model suitable for OLAP/BI tools ##

The data model has been organized into a star schema, aka. dimensional data model.

# Usemon UIs #
There are currently two UIs made for Usemon. The first is a GWT based web app and the other one is Usemon Live, a stand alone Java app that is meant for big screens and for monitoring.

## Usemon GWT UI ##
Once I figure out how to organize and upload an image, I will do so. - Steinar

## Usemon Live ##
Usemon Live is a Processing based UI that displays the dependency graph as soon as it arrives from the Collectors and will animate traffic in your system. Usemon Live is designed to be used on a big screen or wall display to show the current affairs. It will let you drill down and look at the performance data directly as well.

![http://usemon.googlecode.com/svn/wiki/1.png](http://usemon.googlecode.com/svn/wiki/1.png)

More screenshots at UsemonLiveScreenshots.