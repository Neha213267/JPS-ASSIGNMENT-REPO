//for loop
const num = parseInt(prompt('Enter a positive integer: '));

let sum = 0;
for (let i = 1; i <= num; i++) {
    sum += i;
}

console.log('The sum of natural numbers:', sum);

//While loop
console.log('The sum of natural numbers:', sum1);
const num1 = parseInt(prompt('Enter a positive integer: '));

let sum1 = 0, i = 1;
while(i <= num1) {
    sum1 += i;
    i++;
}

console.log('The sum of natural numbers:', sum1);

//Recursion
function sum2(num3) {
    if(num3 > 0) {
        return num3 + sum2(num3 - 1);
    }
    else {
        return num3;
    }
 }

const number = parseInt(prompt('Enter a positive integer: '));

const result = sum2(number);

console.log(`The sum is ${result}`);
