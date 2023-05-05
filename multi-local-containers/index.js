const express = require("express");
const path = require("path");
const storage = require("./storage/storage");

const app = express();

storage.connect();

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "ejs");

app.get("/", async (req, res, next) => {
  var visits = await storage.client().get("visits");

  storage.client().set("visits", (parseInt(visits) + 1).toString());

  res.render("index", { visits: visits });
});

app.listen(8081, () => {
  console.log("Server started an listening requests.");
});
