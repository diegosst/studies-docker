# BASE IMAGE
FROM maven:3.9-amazoncorretto-17

# INSTALL DEPENDENCIES
COPY ./ /opt/service

WORKDIR /opt/service

RUN mvn clean install

# DEFUALT COMMAND
CMD ["mvn", "spring-boot:run"]