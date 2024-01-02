FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/dog-library.jar /app/dog-library.jar
CMD ["java", "-jar", "dog-library.jar"]