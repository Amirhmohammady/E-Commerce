FROM maven:3.6.0-jdk-11-slim As myMaven
USER root
ADD infrastructure /usr/local/folder01/infrastructure
COPY pom.xml /usr/local/folder01/
WORKDIR "/usr/local/folder01/infrastructure/service-discovery/"
CMD ["mvn","spring-boot:run -Dspring-boot.run.profiles=docker"]
