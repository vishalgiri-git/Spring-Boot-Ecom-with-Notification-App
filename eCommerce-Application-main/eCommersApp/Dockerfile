

FROM eclipse-temurin:17-jre-alpine


# Copy only the built jar
COPY target/Ecom-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]