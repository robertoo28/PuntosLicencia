FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base
EXPOSE 8081
ADD target/PuntosSRI-0.0.1-SNAPSHOT.jar PuntosSRI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PuntosSRI-0.0.1-SNAPSHOT.jar"]



