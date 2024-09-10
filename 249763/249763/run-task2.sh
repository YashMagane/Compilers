#!/bin/bash
echo '============================================'
echo
echo 'Cleaning old builds... '
echo
./gradlew -q :task2:clean
echo
echo 'Done.'
echo
echo '============================================'
echo
echo 'Building the project... '
echo
./gradlew -q :task2:build
echo
echo 'Done.'
echo
echo '============================================'
echo
echo 'Input: Demo1.dl (n == 0)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo1.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 0
echo
echo '============================================'
echo
echo 'Input: Demo1.dl (n == 1)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo1.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 1
echo
echo '============================================'
echo
echo 'Input: Demo1.dl (n == 100)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo1.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 100
echo
echo '============================================'
echo
echo 'Input: Demo2.dl (n == 0)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo2.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 0
echo
echo '============================================'
echo
echo 'Input: Demo2.dl (n == 1)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo2.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 1
echo
echo '============================================'
echo
echo 'Input: Demo2.dl (n == 20)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo2.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 20
echo
echo '============================================'
echo
echo 'Input: Demo3.dl (n == 0)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo3.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 0
echo
echo '============================================'
echo
echo 'Input: Demo3.dl (n == 1)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo3.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 1
echo
echo '============================================'
echo
echo 'Input: Demo3.dl (n == 10)'
echo
echo '---------------------'
echo
echo 'Output:'
echo
cat ./task2/Demo3.dl | ./gradlew -q :task2:run | java -cp ./rars_27a7c1f.jar ./RARSInterface.java 10
echo
echo '============================================'
