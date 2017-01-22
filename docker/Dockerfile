FROM openjdk:8-jdk
MAINTAINER Jose Manuel Troconis josemtm87@gmail.com

ADD postcoder-1.0.0.jar postcoder-1.0.0.jar
RUN sh -c 'touch /postcoder-1.0.0.jar'
ENV JAVA_OPTS="-Dspring.data.mongodb.uri=mongodb://postcoder-mongo/postcoder -Dspring.profiles.active=production"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /postcoder-1.0.0.jar" ]