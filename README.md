# client-service

This project was created to show development skills with Springboot and Java 16.

## Frameworks and Tecnologies

All the project's dependencies are listed below:

- Java 16
- Spring Boot 2
- Flyway
- ModelMapper
- Hibernate Validator
- Redis
- Lombok
- MySql


## Installation

Project requires [Java 16](https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html) to run.

Install the dependencies and devDependencies and start the server.

```sh
./gradlew clean bootJar
```

## Docker

```sh
docker run --name client-service -p 8100:8080 -d wylliamsantos/client-service
```

> Note 1: Project needs a mysql instance running locally
> Note 2: Image is pushed automatically to DockerHub when you commit code using Github Actions.

```sh
127.0.0.1:8100
```