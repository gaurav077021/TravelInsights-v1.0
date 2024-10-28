# Use a base image with Java
FROM openjdk:17-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/your-application.jar app.jar

# Expose the application's port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
