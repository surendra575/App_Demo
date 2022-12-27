FROM openjdk:11

COPY target/boot-app.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "boot-app.jar"]
