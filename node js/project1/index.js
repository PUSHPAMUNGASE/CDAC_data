var express = require("express");
var cors = require("cors");
var mongoose = require("mongoose");
var db = require("./database/db.js");

var mysql = require("mysql");
// ===========mysql===============================================

var app = express();
app.use(cors());
var connection = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "password",
  database: "cdac",
});

//it is populate the incoming data
app.use(express.json());
console.log(db);
db();

const Schema = mongoose.Schema;
//const ObjectId = Schema.ObjectId;

const userSchema = new Schema({
  name: String,
  age: Number,
  place: String,
});

const userModel = mongoose.model("users", userSchema);

//http://localhost:9000/users
// get
app.get("/users", async function (req, res) {
  try {
    var result = await userModel.find();
    res.send(result);
  } catch (err) {
    res.send(err.message);
  }
});
// put
app.put("/users", function (req, res) {
  res.send("put data from database");
});

//post
app.post("/users", async function (req, res) {
  console.log(req.body);

  try {
    var record = new userModel(req.body);
    var ans = await record.save();
    res.send("record inserted!");
  } catch (err) {
    res.send(err.message);
  }
});
//delete
app.delete("/users", function (req, res) {
  res.send("delete data from database");
});

//mysql
app.get("/userinfo", function (req, res) {
  connection.query("select * from emp", function (err, data) {
    if (err) {
      res.send(err.message);
    } else {
      res.send(data);
    }
  });
});

app.post("/userinfo", function (req, res) {
  console.log(req.body);
  connection.query("insert into emp set ?", req.body, function (err, result) {
    if (err) {
      res.send(err.message);
    } else {
      res.send("user added");
    }
  });
});

app.listen(9000);
