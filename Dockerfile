# Use a base image with Java
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/TravelInsights-v1.0.jar app.jar

# Expose the application's port
EXPOSE 80

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
