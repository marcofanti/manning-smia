#!/bin/bash

pushd configserver

mvn clean package -Dmaven.test.skip=true
mvn -Dmaven.test.skip=true spring-boot:build-image

popd

pushd licensing-service

mvn clean package -Dmaven.test.skip=true
mvn -Dmaven.test.skip=true spring-boot:build-image

popd

docker-compose -f docker/docker-compose.yml up
