FROM openjdk:8u292-jdk
EXPOSE 8080
WORKDIR /home/docker/jenkinsnine/jenkins_home/sh_jar
ADD test.jar /home/docker/jenkinsnine/jenkins_home/sh_jar/test1.jar
ENTRYPOINT ["java","-jar","test1.jar"]