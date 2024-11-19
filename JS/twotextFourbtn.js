"use strict";





    document.querySelector('div').style.display='none';
    setTimeout(function(){
        document.querySelector('div').style.display='block';
        setTimeout(function(){
       document.querySelector('div').style.display='none';     
        },2000)
    },2000);





// ==========================================================
document.getElementById("btn1").onclick = function () {
  var data1 = document.getElementById("x1").value;
  var data2 = document.getElementById("x2").value;

  var msg = "";
  if (data1 == "" || data2 == "") {
    msg = "Please enter all fields";
  } else if (isNaN(data1) || isNaN(data2)) {
    msg = "All fields should contain numeric values!";
  } else if (data1 == null || data2 == null) {
    msg = "Please enter the value!";
  } else {
   

    var addition = parseInt(data1) + parseInt(data2);

  
    document.getElementById("y1").innerHTML = addition;
   
  }
  document.getElementById("result").innerHTML = msg;
};
// ================================================================
document.getElementById("btn2").onclick = function () {
  var data1 = document.getElementById("x1").value;
  var data2 = document.getElementById("x2").value;

  var msg = "";
  if (data1 == "" || data2 == "") {
    msg = "Please enter all fields";
  } else if (isNaN(data1) || isNaN(data2)) {
    msg = "All fields should contain numeric values!";
  } else if (data1 == null || data2 == null) {
    msg = "Please enter the value!";
  } else {
    var substraction = parseInt(data1) - parseInt(data2);

    document.getElementById("y1").innerHTML = substraction;
  }
  document.getElementById("result").innerHTML = msg;
};
//=======================================================
document.getElementById("btn3").onclick = function () {
  var data1 = document.getElementById("x1").value;
  var data2 = document.getElementById("x2").value;

  var msg = "";
  if (data1 == "" || data2 == "") {
    msg = "Please enter all fields";
  } else if (isNaN(data1) || isNaN(data2)) {
    msg = "All fields should contain numeric values!";
  } else if (data1 == null || data2 == null) {
    msg = "Please enter the value!";
  } else {
    var multiplication = parseInt(data1) * parseInt(data2);

    document.getElementById("y1").innerHTML = multiplication;
  }
  document.getElementById("result").innerHTML = msg;
};
// =====================================================
document.getElementById("btn4").onclick = function () {
  var data1 = document.getElementById("x1").value;
  var data2 = document.getElementById("x2").value;

  var msg = "";
  if (data1 == "" || data2 == "") {
    msg = "Please enter all fields";
  } else if (isNaN(data1) || isNaN(data2)) {
    msg = "All fields should contain numeric values!";
  } else if (data1 == null || data2 == null) {
    msg = "Please enter the value!";
  } else {
    var division = parseInt(data1) / parseInt(data2);

    document.getElementById("y1").innerHTML = division;
  }
  document.getElementById("result").innerHTML = msg;
};


// ========================================================