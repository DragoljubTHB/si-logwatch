FROM openjdk:8-jdk-alpine

# in case of writing to file sys.
VOLUME /tmp

ARG JAR_FILE

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]