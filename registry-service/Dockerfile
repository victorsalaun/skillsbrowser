FROM java:8-jre
MAINTAINER Victor SALAUN <victor.salaun@gmail.com>

ADD ./target/registry-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry-service.jar"]

EXPOSE 8761