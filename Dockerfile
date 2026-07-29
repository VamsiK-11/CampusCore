FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/CampusCore-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 7070

ENTRYPOINT ["java","-jar","app.jar"]