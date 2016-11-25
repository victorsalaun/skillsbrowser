FROM java:8-jre
MAINTAINER Victor SALAUN <victor.salaun@gmail.com>

ADD ../../../target/gateway-ui.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway-ui.jar"]

EXPOSE 4000
