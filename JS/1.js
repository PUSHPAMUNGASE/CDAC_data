"use strict";
console.log(document);
console.log(typeof document);
console.log(document.getElementById("x1"));
console.log(document.getElementById("x2"));

//DOM event handling
//anonymous function
document.getElementById("x1").onclick = function () { 
    console.log(document.body);
    document.body.style.background = "lightgray";
    document.body.style.color = "green";
}

document.getElementById("x2").onclick = function () {
  console.log(document.body);
  document.body.style.background = "black";
  document.body.style.color = "white";
};
