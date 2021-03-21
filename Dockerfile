FROM openjdk

WORKDIR /app

COPY target/pocFundosApi-0.0.1-SNAPSHOT.jar /app/pocFundosApi.jar

ENTRYPOINT ["java", "-jar", "pocFundosApi.jar"]