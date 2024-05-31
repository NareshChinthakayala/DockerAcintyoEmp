FROM openjdk:11
MAINTAINER "Ashok"
COPY target/DockerProject.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DockerProject.jar"]