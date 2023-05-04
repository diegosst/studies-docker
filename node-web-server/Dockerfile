# BASE IMAGE
FROM node:14-alpine

# INSTALL DEPENDENCIES
COPY ./ /opt/web-server

RUN cd /opt/web-server && npm install

# DEFAULT COMMAND
WORKDIR /opt/web-server
CMD ["npm", "start"]