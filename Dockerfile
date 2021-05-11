########build stage########
FROM maven:3.6.0-jdk-11-slim
COPY . /app
WORKDIR /app
RUN mvn clean
RUN mvn package

FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1
WORKDIR /app/target
ENTRYPOINT ["java","-jar","service-0.0.1-SNAPSHOT.jar"]