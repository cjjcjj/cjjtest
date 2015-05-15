#!/bin/sh
mvn clean install
java -Xms30m -Xmx30m -Xmn2m -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -cp target/cjjtest-1.0-SNAPSHOT.jar:$(for i in target/lib/*.jar ; do echo -n $i: ; done) com.chuangwai.cjj.cjjtest.Main
