# Paper Crane API

## Prerequisites

- [Spring Boot CLI](https://docs.spring.io/spring-boot/docs/current/reference/html/cli.html)
- [Docker & Docker Compose](https://docs.docker.com/compose/install/)

## Development

Postgres

```bash
# start postgres docker image
# [-d]: detached mode
# connection - port: 5432 | user: pc | password: password
docker-compose up -d

# check currently running services
docker ps

# access image shell
docker exec -it postgres bash
# connect to db as user "pc"
psql -U pc

# to copy over sql scripts and run them
# the file can then be accessed from the shell using the above instructions
docker cp <file> postgres:/
```

Spring Boot

```bash
# ensure docker image is running
# start development server
# port: 8080
mvn spring-boot:run
```

### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
