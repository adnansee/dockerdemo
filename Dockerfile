FROM openjdk:8-jdk-alpine

COPY target/dockerdemo-0.0.1-SNAPSHOT.jar /dockerdemo.jar

CMD ["java", "-jar", "dockerdemo.jar"]
