FROM public.ecr.aws/docker/library/maven:3.6-jdk-11 AS build

COPY src /app/src

WORKDIR /app

COPY pom.xml /app


RUN mvn clean install -DskipTests




FROM public.ecr.aws/docker/library/maven:3.6-jdk-11

WORKDIR /app


COPY --from=build /app/target/try-Spring-0.0.1-SNAPSHOT.jar spring-app.jar


ENTRYPOINT ["java", "-jar", "spring-app.jar"]