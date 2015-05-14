#!/bin/sh
mvn clean install
java -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:-cp target/cjjtest-1.0-SNAPSHOT.jar:$(for i in target/lib/*.jar ; do echo -n $i: ; done) com.chuangwai.cjj.cjjtest.Main
