# BASE IMAGE
FROM maven:3.9-amazoncorretto-17

# WORKING DIR
WORKDIR /opt/service

# INSTALL DEPENDENCIES

COPY ./item-service ./

RUN mvn clean install

# DEFUALT COMMAND
CMD ["mvn", "spring-boot:run"]
