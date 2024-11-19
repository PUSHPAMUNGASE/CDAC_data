var fs = require("fs");
console.log("start");
var ans = fs.readFileSync("index.html",'UTF-8');
console.log(ans);
console.log("end");
