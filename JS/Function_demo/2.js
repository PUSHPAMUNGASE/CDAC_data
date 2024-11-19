var numbers = [1, 2, 3, 4, 5, 6, 7];
console.log(numbers);

var square1 = [];
for (let i = 0; i < numbers.length; i++) {
  square1.push(numbers[i] * numbers[i]);
}
console.log(square1);

var square2 = numbers.map((num) => num * num);
console.log(square2);

var str = ["pushpa", "komal", "mansi", "sharvari", "kaveri"];
var upper1 = [];
for (let i = 0; i < str.length; i++) {
  upper1.push(str[i].toUpperCase());
}

console.log(upper1);

var lowercase1 = str.map((word) => word.toLowerCase());
console.log(lowercase1);

var uppercase1 = str.map((word) => word.toUpperCase());
console.log(uppercase1);

var concatarr = lowercase1.concat(uppercase1);
console.log("========================array of object====================");

let user = [
  {
    id: 1,
    name: "jill",
    age: 23,
    Science: 56,
    Math: 67,
    Marathi: 68,
  },
  {
    id: 2,
    name: "jack",
    age: 23,
    Science: 86,
    Math: 77,
    Marathi: 98,
  },
  {
    id: 3,
    name: "sam",
    age: 23,
    Science: 44,
    Math: 57,
    Marathi: 78,
  },
  {
    id: 4,
    name: "smith",
    age: 23,
    Science: 46,
    Math: 97,
    Marathi: 98,
  },
];

var name1 = [];
for (let i = 0; i < user.length; i++) {
  name1.push(user[i].name);
}
console.log(name1);

console.log("==================by using map===================");
//it itrate over the array which contain the opration perform on that array
var name2 = user.map((user) =>
  Math.round((user.Science + user.Math + user.Marathi) / 3)
);
console.log(name2);
