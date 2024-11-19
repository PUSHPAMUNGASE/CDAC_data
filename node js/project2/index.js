var express = require("express");
var mongoose = require("mongoose");
var db = require("./db/db.js");
var mysql = require("mysql");

var app = express();
app.use(express.json());
console.log(db);
db();

const Schema = mongoose.Schema;

const productSchema = new Schema({
    name: String,
    price: Number,
    discount:String
})

const productModel = mongoose.model("products", productSchema);


app.get("/products", async function (req, res) {
    try {
        var result = await productModel.find();
        res.send(result);
    } catch (err) {
        res.send(err.message)
    }
});



//post
app.post("/products", async function (req, res) {
    console.log(req.body);
    try {
        var record = new productModel(req.body);
        var ans = await record.save();
        res.send("record inserted!");
    } catch (err) {
        res.send(arr.message);
    }
});

app.listen(9900);