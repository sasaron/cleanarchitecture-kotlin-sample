FROM openjdk:16-slim as builder
WORKDIR /app
COPY . /app
RUN [ "./gradlew", "build" ]

FROM openjdk:16-slim as prod
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar ddd-kotlin-sample.jar
ENTRYPOINT ["java","-jar","/app/ddd-kotlin-sample.jar"]

FROM openjdk:16-slim as dev
WORKDIR /app
COPY . /app
RUN [ "./gradlew", "build" ]
ENTRYPOINT [ "./gradlew", "--project-cache-dir=/tmp/gradlew-cache" , "bootRun" ]
