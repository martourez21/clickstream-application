FROM openjdk:17
EXPOSE 8084
ADD target/clickstream-application.jar clickstream-application.jar
ENTRYPOINT ["java","-jar","/clickstream-application.jar"]