FROM java:8-jre
MAINTAINER Victor SALAUN <victor.salaun@gmail.com>

ADD ./target/config-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-service.jar"]

EXPOSE 8888