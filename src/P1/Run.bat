@ECHO OFF

set CLASSPATH=%PATH%;P1;P2
javac -encoding Windows1251 Demo.java

java Demo
pause