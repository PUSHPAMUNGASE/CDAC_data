// https://api.openweathermap.org/data/2.5/weather?q=New%20york&appid=1d8be6af75fa17ae1f3c04d96a6e0b6f
"use strict";
document.getElementById("btn").addEventListener("click", function () {
  alert("button 1 clicked");

  var city = document.getElementById("s1").value;
  var xmlhttp = new XMLHttpRequest();
  console.log(xmlhttp);
  console.log(xmlhttp.readyState);

  console.log(xmlhttp.status);
  xmlhttp.onreadystatechange = function () {
    console.log(xmlhttp.readyState);
    console.log(xmlhttp.status);
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
      console.log(xmlhttp.responseText);
      var res = JSON.parse(xmlhttp.responseText);
      console.log(res);
      document.getElementById("temp").innerHTML = res.main.temp;
      document.getElementById("humidity").innerHTML = res.main.humidity;
      document.getElementById("wind").innerHTML = res.wind.speed;
    }
  };
  xmlhttp.open(
    "GET",
    `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=1d8be6af75fa17ae1f3c04d96a6e0b6f`,
    true
  ); //fetch,send,update,delete then open method;
  xmlhttp.send();
});
