"use strict";
const number = 20;
try {
    number = 100;
} catch (err) {
    console.log(err);
}
console.log(number);
// expected output: 42
//Assigning Object
const obj = {
    name: "neha"
};
console.log(obj.name);
obj.name = "neha";
console.log(obj.name);