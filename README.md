[//]: # ([![CircleCI]&#40;https://dl.circleci.com/status-badge/img/gh/zakdim/spring5-reactive-mongo-recipe-app/tree/master.svg?style=svg&#41;]&#40;https://dl.circleci.com/status-badge/redirect/gh/zakdim/spring5-reactive-mongo-recipe-app/tree/master&#41;)
[comment]: <> ([![codecov]&#40;https://codecov.io/gh/zakdim/spring5-mysql-recipe-app/branch/master/graph/badge.svg?token=SF6BA3YVF7&#41;]&#40;https://codecov.io/gh/zakdim/spring5-mysql-recipe-app&#41;)

# Section 7: Web Development with Spring MVC

## s07-110 InjelliJ Compiler Configuration for Spring Boot Development Tools

* `CTRL-SHIFT-A` - to bring `Actions` dialoque

1. Search for `Registry...`
2. Find key`compiler.automake.allow.when.app.running` and enable it.
3. Settings > Build, Execution, Deployment > Compiler. Enable `Build project automatically`.

## H2 Console

localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

## s10-181 Continuous Integration Testing with Circle CI

Simple change to trigger Circle CI

## Section 18 - Using MySQL with Spring Boot

### Lecture 308 - Assignement Review - Configuration of MySQL

* Create MySQL docker container `mysqldb-sfg`

```
# Use the same MySQL as in the course lecture (mysql:5)
docker pull mysql:5

docker run --name mysqldb-sfg -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql:5
docker logs -f mysqldb-sfg

# MySQL 8.0
#docker run --name mysqldb-sfg -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0`
# With MySQL 8.0
# docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=password -d mysql mysqld --default-authentication-plugin=mysql_native_password 
#docker run -p 3306:3306 --name mysqldb-sfg -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0 mysqld --default-authentication-plugin=mysql_native_password 
```

* Use `SequelPro` application to connect to MySQL running in docker container

Name: mysqldb-sfg
Host: 127.0.0.1
Username: root
Password:

* In `SequelPro` execute queries from `scripts/configure-mysql.sql` to initialize DBs and users

### Lecture 311 - Spring Boot Configuration for MySQL

* Run spring boot application with profile from command line:

``` 
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## Section 19 - Spring Data MongoDB

### Lecture 317 - Mongo Application Code Review

Recipe Application Using MongoDB

* [GitHub springframeworkguru/spring5-mongo-recipe-app](https://github.com/springframeworkguru/spring5-mongo-recipe-app)


### Lecture 321 - Refactoring Data Model for MongoDB

* Install [Robo 3T](https://robomongo.org/)

Update port for embedded mongo DB (see springboot app log: "Opened connection" ...)