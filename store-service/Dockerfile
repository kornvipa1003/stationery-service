# 🧰 Use a slim Java image for smaller footprint
FROM openjdk:17-jdk-slim

# 📁 Set the working directory inside the container
WORKDIR /app

# 📦 Copy the compiled JAR file into the image
COPY target/store-service.jar app.jar

# 🚪 Expose the port your app listens on
EXPOSE 8083

# 🚀 Launch the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]