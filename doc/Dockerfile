FROM java:8
ADD demo-0.0.1-SNAPSHOT-exec.jar /demo-0.0.1-SNAPSHOT-exec.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/demo-0.0.1-SNAPSHOT-exec.jar"]