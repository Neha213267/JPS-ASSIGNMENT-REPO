const cumulativeSum = (sum => value => sum += value)(0);

console.log([9,2,5,6,8,7].map(cumulativeSum));
