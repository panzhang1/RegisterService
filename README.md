# Register Service
This is pan zhang's practice project for micoservice
Build a config server, this can be a common service used by multiple service

## Usage Guild
- Directly Run
gradle build
gradle bootRun
gradle bootRun --debug-jvm

- Run by Docker
https://spring.io/guides/gs/spring-boot-docker/#initial

gradle build docker
docker run -p 8761:8761 -t pangu/registerservice

- Debug for Docker
docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n"

- stop Docker service
docker ps
docker stop "container id"
docker rm "container id"

## Register Service
http://localhost:8761/eureka/apps