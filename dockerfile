FROM openjdk:8
EXPOSE 8080
WORKDIR /home/docker/jenkinsnine/jenkins_home/dok_jar
COPY test.jar /home/docker/jenkinsnine/jenkins_home/dok_jar/test.jar
ENTRYPOINT ["java","-jar","test.jar"]