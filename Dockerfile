FROM openjdk:17
EXPOSE 8084
ADD target/springboot-message-topic.jar springboot-message-topic.jar
ENTRYPOINT ["java","-jar","/springboot-message-topic.jar"]