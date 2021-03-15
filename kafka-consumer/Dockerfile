#FROM maven:latest as maven
#
#COPY ./pom.xml ./pom.xml
#COPY ./src ./src
#
#RUN mvn clean package
#
#FROM openjdk:11-jre-slim
#
#WORKDIR ./app
#VOLUME ./tmp
#
#COPY --from=maven ./target/kafka-consumer-*-SNAPSHOT.jar ./kafka-consumer.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "./kafka-consumer.jar"]


FROM openjdk:11-jre-slim

COPY  ./target/kafka-consumer-*-SNAPSHOT.jar ./kafka-consumer.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "./kafka-consumer.jar"]