# For Java 8, try this
#FROM openjdk:8-jdk-alpine

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
#ARG JAR_FILE=build/target/covid19-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp build/target/covid19-0.0.1-SNAPSHOT /opt/app/app.jar
#COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
#ENTRYPOINT ["java","-jar","app.jar"]
FROM node:7-alpine
RUN apk add -U subversion