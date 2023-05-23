# Do Some Integration

## A project for learning basics of Apache Camel with Spring Boot framework and related technologies.

## How to run

Most straightforward way is simply use Maven and Spring Boot plugin goal

```./mvnw -U clean install -DskipTests=true && ./mvnw spring-boot:run -pl integration-service-module```

Please note that skipping test is enabled. If you want to run with teste remove the option.

## How to send a request and get a response

In order to test the application you must run the application as described above. **Also you
have to have __ActiveMQ__ deployed on your localhost system for this app
to work. Use you system's recommended way to do so.** One way how to send a request on Unix systems (WSL2, cygwin etc.)
is
this:

```
curl -X POST -H "Content-Type: application/json" -d '{"id": 12345,"firstname": "John","lastname": "Doe","updatedAt": "
2023-02-14 10:38:00"}' http://localhost:8080/CRMEvent/Account
```

You should recieve this response after command had finished:

```
CommonModel(operation=PostAccount, apiModel=AccountModel(id=12345, firstname=John, lastname=Doe, updatedAt=Tue Feb 14 11:38:00 CET 2023))
```