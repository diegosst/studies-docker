# BASE IMAGE
FROM node:14-alpine

# DEFINE WORKING DIR
WORKDIR /opt/web-server

# INSTALL DEPENDENCIES
COPY ./package.json ./

RUN npm install

COPY ./ ./

# DEFAULT COMMAND
CMD ["npm", "start"]
