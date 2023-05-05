const redis = require("redis");
require("dotenv").config();

var redisClient;

async function connect() {
  redisClient = redis.createClient({
    url: process.env.REDIS_URL,
  });

  redisClient.on("error", (error) =>
    console.error(`Could not connect to redis server. ${error}`)
  );

  await redisClient.connect();
}

function client() {
  return redisClient;
}

module.exports = { connect, client };
