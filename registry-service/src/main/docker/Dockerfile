FROM java:8-jre
MAINTAINER Victor SALAUN <victor.salaun@gmail.com>

ADD registry-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761