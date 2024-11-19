const express = require("express");
const nodemailer = require("nodemailer");
const mongoose = require("mongoose");
const db = require("./db/db.js"); //it handle the database connection
db();
console.log(db);

const app = express();
app.use(express.json());

app.use(express.urlencoded());

const transporter = nodemailer.createTransport({
  //   host: "smtp.gmail.com",
  //   port: 587,
  //   secure: false, // true for port 465, false for other ports
  service: "gmail",
  auth: {
    user: "pushpamungase@gmail.com",
    pass: "wqrz rqkk wxrp kwva",
  },
});

// ==========================================================
const Schema = mongoose.Schema;

const userSchema = new Schema({
  name: String,
  email: String,
  mobile: Number,
});

const userModel = mongoose.model("newusers", userSchema);

//routename
app.get("/add", function (req, res) {
  res.render("addUser.ejs");
});

app.get("/show", async function (req, res) {
  try {
    var result = await userModel.find();
    res.render("showUser.ejs", { data: result });
  } catch (err) {
    res.send(err.message);
  }
});

app.post("/useraction", async function (req, res) {
  // console.log(req.body);
  try {
    var record = new userModel(req.body);
    await record.save();
    main(req.body.email);
    res.redirect("/show");
  } catch (err) {
    res.send(err.message);
  }
});

// async..await is not allowed in global scope, must use a wrapper
async function main(emailid) {
  // send mail with defined transport object
  const info = await transporter.sendMail({
    from: "<pushpamungase@gmail.com>", // sender address
    to: emailid, // list of receivers
    subject: "Birth day", // Subject line
    text: "Hello", // plain text body
    html: "<h1>HAPPY BIRTHDAY</h1>", // html body
  });

  console.log("Message sent: %s", info.messageId);
  // Message sent: <d786aa62-4e0a-070a-47ed-0b0666549519@ethereal.email>
}

app.listen(9000);
