FROM registry:5000/java:8
VOLUME /tmp
EXPOSE 8280
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
