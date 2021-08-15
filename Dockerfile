FROM openjdk:8
ADD target/alchemist-stripe-docker.jar alchemist-stripe-docker.jar
EXPOSE 8180
ENTRYPOINT ["java","-jar","alchemist-stripe-docker.jar"]