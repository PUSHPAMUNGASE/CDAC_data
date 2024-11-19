//this is custom module
var mongoose = require('mongoose');

async function dbconnect() {
    //this is the local connection
    //mongodb located on port no 27017
    var connection = await mongoose.connect('mongodb://127.0.0.1:27017/userdetails');

    return connection;
}

module.exports = dbconnect;