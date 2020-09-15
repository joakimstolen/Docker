#!/bin/bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker build . --tag docker_test2 --build-arg JAR_FILE=./target/Docker-0.0.1-SNAPSHOT.jar
docker tag docker_test2  joakimstolen/docker_test2
docker push joakimstolen/docker_test2:latest