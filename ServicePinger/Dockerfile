FROM openjdk:11
VOLUME /tmp
COPY target/*.jar ServicePinger-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ServicePinger-0.0.1-SNAPSHOT.jar"]