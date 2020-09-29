FROM java:8-jdk-alpine
ADD ./target/hazelcast-ex-0.0.1-SNAPSHOT.jar hazelcast-ex-0.0.1-SNAPSHOT.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "hazelcast-ex-0.0.1-SNAPSHOT.jar"]