FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY target/delivery-service-docker-images.jar delivery-service-docker-images.jar
EXPOSE 8083
CMD ["java","-jar","delivery-service-docker-images.jar"]