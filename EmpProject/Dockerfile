FROM openjdk:11
COPY target/EmpProject-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "EmpProject-0.0.1-SNAPSHOT.jar"]