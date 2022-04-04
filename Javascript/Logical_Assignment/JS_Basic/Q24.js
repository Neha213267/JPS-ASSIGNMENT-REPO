var num = 12354987,
    result = [],
    num1 = num.toString();

for (var i = 0, len = num1.length; i < len; i += 1) {
    result.push(+num1.charAt(i));
}

console.log(result);
