FROM maven:4.0.0-rc-5-ibm-semeru-25-noble AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-focal
COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]