var fs = require('fs');
console.log("start");
//asynchronous way to read file
fs.readFile("index.html","UTF-8", function (err, data) {
    console.log(data);
})
console.log("end")