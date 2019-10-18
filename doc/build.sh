#!/usr/bin/env bash

cp -f ../target/demo-0.0.1-SNAPSHOT-exec.jar .
docker build -t 10.172.49.246/jiangsu_clmp_test/demo:0.0.1 .
docker images |grep demo:0.0.1
#docker push 10.172.49.246/jiangsu_clmp_test/demo:0.0.1
