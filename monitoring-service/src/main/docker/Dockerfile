FROM java:8-jre
MAINTAINER Victor SALAUN <victor.salaun@gmail.com>

ADD monitoring-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring.jar"]

EXPOSE 8989 8080