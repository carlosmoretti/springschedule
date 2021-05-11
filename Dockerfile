########build stage########
FROM maven:3.6.0-jdk-11-slim 
RUN mvn clean
RUN mvn package

FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1
COPY . /app
ENTRYPOINT ["java","-jar","app/target/service-0.0.1-SNAPSHOT.jar"]