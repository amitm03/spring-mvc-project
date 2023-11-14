FROM openjdk:17
VOLUME /tmp
EXPOSE 8092
ARG JAR_FILE=target/lab-exercise-909-1.0.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]