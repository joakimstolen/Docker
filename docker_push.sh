#!/bin/bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker build . --tag forelesning4_devops --build-arg JAR_FILE=./target/Forelesning4-0.0.1-SNAPSHOT.jar
docker tag forelesning4_devops  joakimstolen/forelesning4_devops
docker push joakimstolen/forelesning4_devops

