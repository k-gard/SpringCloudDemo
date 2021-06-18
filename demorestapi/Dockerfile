FROM openjdk:16-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE}  app.jar
EXPOSE 8040
ENTRYPOINT ["java","-jar","/app.jar"]
