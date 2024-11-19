document.getElementById("btn").onclick = function () {
  // alert('Hello, World!');
  // confirm('Are you sure you want to proceed?');
  // prompt('Enter your name:');

  //console.log(document.getElementById("x1"));
  var data = document.getElementById("x1").value;
  console.log(data);

  //var msg = "";
  // if (data == "") {
  //     msg = "please enter pincode";
  // } else if (data.length != 6) {
  //     msg= "pincode should be 6 digits";
  // } else {
  //     msg="pincode is valid";
  // }

  var msg =
    data == ""
      ? "please enter pincode"
      : data.length != 6
      ? "pincode should be 6 digits"
      : "pincode is valid";

  console.log(document.getElementById("result"));
  document.getElementById("result").innerHTML = msg;
};
