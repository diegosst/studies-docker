var express = require('express');
var router = express.Router();

var number = 0;

/* GET home page. */
router.get('/', function(req, res, next) {
  
  counter();

  res.render('index', { title: number });
});

async function counter() {
  while (true) {
      number++;
      await sleep(1000);
  }
}


function sleep(ms) {
  return new Promise((resolve) => {
      setTimeout(resolve, ms);
  });
}

module.exports = router;
