#!/bin/bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker build . --tag test_for_docker --build-arg JAR_FILE=./target/Docker-0.0.1-SNAPSHOT.jar
docker tag test_for_docker joakimstolen/test_for_docker
docker push joakimstolen/test_for_docker