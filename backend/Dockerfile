FROM openjdk:17-jdk-alpine

LABEL authors="Bence Bukovec"

WORKDIR /app

COPY target/stackoverflow-tw-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]