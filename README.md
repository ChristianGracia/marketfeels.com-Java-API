# stock-site-back-end-k8
This repo contains a Dockerized Java Spring Boot API back-end that is part of a many pods in a Kubernetes cluster

## Installation

build jar

`mvnw package && java -jar target/cg-stock-site-0.0.1-SNAPSHOT.jar`

build docker image

`docker build -t stock-site-back-end .`

run docker container

`docker container run --publish 8080:8080 --detach stock-site-back-end`
