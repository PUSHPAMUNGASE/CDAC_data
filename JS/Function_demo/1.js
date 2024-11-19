//named functions

// function sayHello() {
//   var name = "pushpa";
//   console.log(`Hello ${name}`);
// }
// sayHello();

//================================================================

//
var fun = function () {
  var name = "pushpa";
  console.log(`Hello ${name}`);
};

fun();

//================================================================
const greet = () => console.log("Good Morning");
greet();

//================================================
let marveHeros = ["Iron Man", "Thor", "Captain America", "Black Widow"];
var cap = marveHeros[2];
console.log(cap);
console.log("=======================================");
console.log(marveHeros);
marveHeros.push("Spider Man"); //add at last
marveHeros.shift();
console.log("=========================slice method=====================");
//start index+1;
//does not change original array
console.log(marveHeros.slice(2));

console.log("=========================splice method=====================");
//manipulate the original array
//fromstrt index to the last one
// var arr = marveHeros.splice(0, 2);
// console.log(arr);

//normal for loop

console.log("============normal for loop====================");
for (let i = 0; i < marveHeros.length; i++) {
  console.log(marveHeros[i]);
}
console.log("============for of loop====================");
//for of gives value
for (let hero of marveHeros) {
  console.log(hero);
}
console.log("============ for in loop====================");
//for in give index
for (let hero in marveHeros) {
  console.log(hero);
}

//for each
marveHeros.forEach(([i]) => console.log(i));

console.log("==================splice add element===================");
marveHeros.splice(1, 2, "Aquaman");
console.log(marveHeros);
