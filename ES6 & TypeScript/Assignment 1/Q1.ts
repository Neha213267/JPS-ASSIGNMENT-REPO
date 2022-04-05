
let number = 20;
try {
  number = 100;
} catch (err) {
  console.log(err);
}

console.log(number);
// expected output: 100



//Assigning Object
const obj={
    name:"neha"
};
console.log(obj.name);
obj.name="neha";
console.log(obj.name);
