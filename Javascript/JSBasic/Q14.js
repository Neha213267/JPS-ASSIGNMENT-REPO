var array = [1,2,3,2,4,2,6,2];
console.log(array.filter(function(el, ind){
  return ind % 2 === 0;
}));