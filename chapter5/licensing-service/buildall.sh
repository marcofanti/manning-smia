#!/bin/bash

#pushd configserver

mvn clean package -Dmaven.test.skip=true
mvn -Dmaven.test.skip=true spring-boot:build-image

docker tag licensing-service:0.0.2-SNAPSHOT cacofanti/licensing-service:0.0.2-SNAPSHOT

docker push cacofanti/licensing-service:0.0.2-SNAPSHOT

#popd

