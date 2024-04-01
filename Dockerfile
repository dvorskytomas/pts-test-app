FROM eclipse-temurin:latest
VOLUME /tmp
COPY /target/pts-test-app-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
