//how to create oen server live server

var http = require("http");
//console.log(http);
const server = http.createServer(function (req, res) {
    console.log(typeof req, typeof res);
    res.end("Hello world!"); 
});

server.listen(5000);
