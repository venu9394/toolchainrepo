FROM openjdk:11
ADD cloud-cicd/cloud-cicd.jar cloud-cicd.jar
EXPOSE 9095
ENTRYPOINT ["java","-jar","application.jar"]
