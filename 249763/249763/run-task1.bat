@echo off
echo ============================================
echo Cleaning old builds... 
echo(
cmd /c "gradlew -q :task1:clean"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Building the project...
echo( 
cmd /c "gradlew -q :task1:build"
echo(
echo Done.
echo(
echo ============================================
echo(
echo Input: Demo1.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo1.dl | .\gradlew -q :task1:run --args="0""
echo(
echo ============================================
echo(
echo Input: Demo1.dl (n == 1)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo1.dl | .\gradlew -q :task1:run --args="1""
echo(
echo ============================================
echo(
echo Input: Demo1.dl (n == 100)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo1.dl | .\gradlew -q :task1:run --args="100""
echo(
echo ============================================
echo(
echo Input: Demo2.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo2.dl | .\gradlew -q :task1:run --args="0""
echo(
echo ============================================
echo(
echo Input: Demo2.dl (n == 1)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo2.dl | .\gradlew -q :task1:run --args="1""
echo(
echo ============================================
echo(
echo Input: Demo2.dl (n == 20)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo2.dl | .\gradlew -q :task1:run --args="20""
echo(
echo ============================================
echo(
echo Input: Demo3.dl (n == 0)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo3.dl | .\gradlew -q :task1:run --args="0""
echo(
echo ============================================
echo(
echo Input: Demo3.dl (n == 1)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo3.dl | .\gradlew -q :task1:run --args="1""
echo(
echo ============================================
echo(
echo Input: Demo3.dl (n == 10)
echo(
echo ---------------------
echo(
echo Output:
echo(
cmd /c "type .\task1\Demo3.dl | .\gradlew -q :task1:run --args="10""
echo(
echo ============================================
