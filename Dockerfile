FROM amazoncorretto:17-alpine3.17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src
CMD ["./mvnw", "spring-boot:run"]