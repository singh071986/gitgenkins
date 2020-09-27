FROM openjdk:8
EXPOSE 8080
ADD target/gitgenkins.jar gitgenkins.jar
ENTRYPOINT ["java", "-jar", "/gitgenkins.jar"]