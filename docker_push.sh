#!/bin/bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker build . --tag docker_test --build-arg JAR_FILE=./target/Forelesning4-0.0.1-SNAPSHOT.jar
docker tag docker_test  joakimstolen/docker_test
docker push joakimstolen/docker_test

