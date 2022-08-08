FROM openjdk:8
EXPOSE 8080
ADD target/devops-springboot-sample.jar devops-springboot-sample.jar
ENTRYPOINT ["java","-jar","/devops-springboot-sample.jar"]