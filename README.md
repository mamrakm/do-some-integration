# do-some-integration

## A project for learning basics of Apache Camel with Spring Boot framework and related technologies.

## How to run

Most straightforward way is simply use Maven and Spring Boot plugin goal

```./mvnw -U clean install -DskipTests=true && ./mvnw spring-boot:run -pl integration-service-module```

Please note that test phase is skipped in the command. To run build including unit tests remove the skipTests parameter or change value to false.

## How to send a request and get a response

In order to test the application you must run the application as described above. **Also access to a running __ActiveMQ__ instance is required for this app to work. Use you system's recommended way to do so.** One way how to send a request on Unix systems (WSL2, cygwin etc.) is the following:

```
curl -X POST -H "Content-Type: application/json" -d '{"id": 12345,"firstname": "John","lastname": "Doe","updatedAt": "
2023-02-14 10:38:00"}' http://localhost:8080/CRMEvent/Account
```

You should recieve this response after command had finished:

```
CommonModel(operation=PostAccount, apiModel=AccountModel(id=12345, firstname=John, lastname=Doe, updatedAt=Tue Feb 14 11:38:00 CET 2023))
```

[![Java CI with Maven](https://github.com/mamrakm/do-some-integration/actions/workflows/maven.yml/badge.svg)](https://github.com/mamrakm/do-some-integration/actions/workflows/maven.yml)
