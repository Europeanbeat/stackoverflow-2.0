# Start with a base image containing Java runtime and Maven
FROM maven:3.8.3-openjdk-17 as build

# Create app directory
WORKDIR /app

# Copy the pom.xml file
COPY pom.xml .

# Download all required dependencies into one layer
RUN mvn dependency:go-offline -B


# Copy rest of the project
COPY src src

# Package application
RUN mvn clean package

# Start new image
FROM openjdk:17-jdk-alpine

LABEL authors="Bence Bukovec"

WORKDIR /app

# Copy .jar from the previous image layer
COPY --from=build /app/target/stackoverflow-tw-0.0.1-SNAPSHOT.jar stackoverflow-tw-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "stackoverflow-tw-0.0.1-SNAPSHOT.jar"]

