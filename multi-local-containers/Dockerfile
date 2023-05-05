# BASE IMAGE
FROM node:alpine

# BASE DIR
WORKDIR /app

# INSTALL DEPENDENCIES
COPY ./package.json ./

RUN npm install

COPY ./ ./

# DEFAULT COMMAND
CMD ["npm", "start"]