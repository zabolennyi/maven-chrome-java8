#!/bin/bash

DOCKER_IMAGE=zabolennyi/maven-chrome-java8

docker pull $DOCKER_IMAGE
docker run -it -v "$PWD":/usr/src -w /usr/src $DOCKER_IMAGE mvn clean verify