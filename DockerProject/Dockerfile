FROM eclipse-temurin:17-jdk-alpine
MAINTAINER "harsha"
COPY target/DockerProject-0.0.1-SNAPSHOT.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DockerProject-0.0.1-SNAPSHOT.jar"]