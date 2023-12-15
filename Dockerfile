FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY target/goodservice-0.0.1-SNAPSHOT.jar goodservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","goodservice-0.0.1-SNAPSHOT.jar"]


