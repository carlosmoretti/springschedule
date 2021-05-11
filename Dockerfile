########build stage########
FROM maven:3.6.0-jdk-11-slim
COPY . /app
WORKDIR /app
RUN mvn clean
RUN mvn package

FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1
COPY . /app
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]