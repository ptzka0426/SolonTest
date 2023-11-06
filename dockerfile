FROM java:8
EXPOSE 8080
WORKDIR /home/docker/jenkinsnine/jenkins_home/sh_jar
ADD daji-git-1.0-SNAPSHOT.jar /home/docker/jenkinsnine/jenkins_home/sh_jar/test.jar
ENTRYPOINT ["java","-jar","/home/docker/jenkinsnine/jenkins_home/sh_jar/test.jar"]