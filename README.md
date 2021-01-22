# stock-site-back-end-k8
This repo contains a Dockerized Java Spring Boot API back-end that is part of a many pods in a Kubernetes cluster

## Installation

build jar

`mvnw package && java -jar target/cg-stock-site-0.0.1-SNAPSHOT.jar`

build docker image

`docker build -t stock-site-back-end .`

run docker container

`docker container run --publish 8080:8080 --detach stock-site-back-end`

## Google Cloud Installation

clone this repo in google cloud shell

cd into cloned repo

in google cloud shell type:

`./mvnw -DskipTests package`

`gcloud services enable containerregistry.googleapis.com`

`export GOOGLE_CLOUD_PROJECT=`gcloud config list --format="value(core.project)"``

`./mvnw -DskipTests com.google.cloud.tools:jib-maven-plugin:build \
  -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/java-api:v1`

confirm with 

`docker run -ti --rm -p 8080:8080 \
  gcr.io/$GOOGLE_CLOUD_PROJECT/java-api:v1`
  
  
  create deployment

  
  `kubectl create deployment java-api \
  --image=gcr.io/$GOOGLE_CLOUD_PROJECT/java-api:v1`
  
    Create kubernetes service
  
  `kubectl create service loadbalancer java-api --tcp=8080:8080`
  
  **sending to google cloud container registry**
  
  build
  
  `docker build -t java-api .`
  
  tag
  
  `docker tag java-api us.gcr.io/marketfeels/java-api:latest`
  
  push
  
  `docker push us.gcr.io/marketfeels/java-api`
  
  
  
  
