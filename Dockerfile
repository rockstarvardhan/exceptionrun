FROM  openjdk:17


COPY ./target/mapdemo-0.0.1-SNAPSHOT.jar springboot1.jar



ENTRYPOINT ["java","-jar","springboot1.jar"]