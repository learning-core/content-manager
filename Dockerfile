FROM openjdk

RUN mkdir -p /app

WORKDIR /app

COPY /target/content-manager-0.0.1-SNAPSHOT.jar /app/content-manager.jar

ENTRYPOINT ["java","-jar","content-manager.jar"]
