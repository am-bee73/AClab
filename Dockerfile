FROM openjdk:8-jdk-alpine
COPY target/cloudlab-0.0.1-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "java -jar /app.jar"]