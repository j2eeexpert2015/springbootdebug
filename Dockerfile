FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n
COPY target/springbootdebug-0.0.1-SNAPSHOT.jar springbootdebug.jar
EXPOSE 8080
EXPOSE 5005
CMD ["java", "-jar", "springbootdebug.jar"]
