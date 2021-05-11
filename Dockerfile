########build stage########
FROM maven:3.6.0-jdk-11-slim
COPY src /home/app/src
COPY pom.xml /home/app/pom.xml
RUN mvn -f /home/app/pom.xml clean package

FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1
COPY --from=build /home/app/target/service-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]