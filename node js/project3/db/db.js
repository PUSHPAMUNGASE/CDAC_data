const mongoose = require('mongoose');

async function dbconnection() {
  const dbconnection = await mongoose.connect(
    "mongodb://127.0.0.1:27017/product"
  );  
    
    return dbconnection;
}

module.exports = dbconnection;
