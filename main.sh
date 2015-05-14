#!/bin/sh
mvn clean install
java -Xmx10g -Xms10g -Xmn2g -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:/usr/local/cjjtest/gc.log -cp target/cjjtest.1.0-SNAPSHOT.jar:$(for i in target/lib/*.jar ; do echo -n $i: ; done) com.chuangwai.cjj.cjjtest.Main
