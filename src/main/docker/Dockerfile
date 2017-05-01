FROM openjdk:alpine
# Spring Boot application creates working directories for Tomcat by default
VOLUME /tmp
ADD hello-1.0.0.jar hello.jar
# To reduce Tomcat startup time we added a system property pointing to "/dev/urandom" as a source of entropy.
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello.jar"]