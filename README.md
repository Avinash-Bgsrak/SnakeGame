<pre>
========================
  HOW TO BUILD AND RUN
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "SnakeGame.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

==============================
ALTERNATE TO ONLY RUN THE GAME 
==============================
Simply download and open SnakeGame.jar which is in this repository and play the game!!!
Note : JDK Must be installed.

<pre>
