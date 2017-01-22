# postcoder

# Project description
This is a Demo application of using `Spring Boot` and `MongoDB`, along with Spring modules like `Core`, `Web`, `AOP` and `Cache`.

This application is intended to work as a middleware of part of a third party Rest Service in order to avoid repeated requests and achieve that this application stores all the different requests and stores the responses.

The implemented endpoints of the third party API are described in the following urls:
- https://developers.alliescomputing.com/postcoder-web-api/address-lookup/eircode
- https://developers.alliescomputing.com/postcoder-web-api/address-lookup/premise

All the responses received from the third party Rest Service are stored in a `MongoDB` database and it is also cached to offer the corresponding response when it is received a repeated request. 

## How to run the project locally
To build, or run project locally `java` and `MongoDB` should be installed.
```bash
cd `project folder`
```
```bash
mvn package
```
```bash
cd target/
```
```bash
java -jar postcoder-1.0.0.jar
```

## How to run the project in Docker
This section describes how to run this application and `MongoDB` in Docker containers.   
Docker should be already installed.

### Create network
```bash
docker network create postcoder_net
```

### Run MongoDB in Docker
Create folder for storing Mongo DB data:
```bash
mkdir -p ~/mongo-data
```

Run Mongo in container:
```bash
docker run --name postcoder-mongo --network=postcoder_net -v ~/mongo-data:/data/db -d mongo
```

### Build project and copy jar file to docker folder
To build current project and copy `jar` file to the `docker` folder of current project:
```bash
mvn package && cp `project folder`/target/postcoder-1.0.0.jar docker/
```

### Build application's image
Go to `docker` folder of this project and build image:
```bash
cd docker && sudo docker build --tag=postcoder-1.0.0 .
```
### Run Spring Boot in Docker
To run build application `jar` file in Docker:
```bash
docker run -d --name postcoder --network=postcoder_net -p 8080:8080 postcoder-1.0.0
```

## How to work the application
After the application is started it will be possible to perform the same operations that it offers the third party API in the following urls:
- https://developers.alliescomputing.com/postcoder-web-api/address-lookup/eircode

- https://developers.alliescomputing.com/postcoder-web-api/address-lookup/premise

## Verify application and Mongo started correctly
Perform a GET request to the folling example endpoints:

- http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/ie/D02X285?lines=3&format=json

- http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=json
