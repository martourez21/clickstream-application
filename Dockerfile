#FROM openjdk:17
#EXPOSE 8084
#ADD target/clickstream-application.jar clickstream-application.jar
#ENTRYPOINT ["java","-jar","/clickstream-application.jar"]

FROM openjdk:17
EXPOSE 8084
WORKDIR /app

# Assuming the downloaded JAR is in the workspace root
COPY clickstream-application.jar .

ENTRYPOINT ["java", "-jar", "clickstream-application.jar"]
