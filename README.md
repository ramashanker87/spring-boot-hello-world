# spring-boot-hello-world
ci cd repository for springboot
## Create seprate repository in git hub

## Clone the project

## Create springboot application

## Build Project

    mvn clean install

## Run the project

    mvn spring-boot:run

## Dockerize the application

    docker build -t spring-boot-hello-world .

## List docker image
    
    docker images

## Run and verify the docker images

    docker run -p 8080:8080 spring-boot-hello-world:latest
    http://localhost:8080/hello
    http://localhost:8080/actuator/health

## Create ECR for Spring app
```Bash
    aws cloudformation deploy --template-file ecr-template.yml --stack-name rama-spring-ecr-repo 
```
## Create Code build pipe
