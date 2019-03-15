@ECHO OFF

set CLASSPATH=%PATH%;MyPack;MyPack1

javac -encoding Windows1251 TestBalance.java

java TestBalance

pause