FROM openjdk:16-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE}  app.jar
EXPOSE 8010
ENTRYPOINT ["java","-jar","/app.jar"]
