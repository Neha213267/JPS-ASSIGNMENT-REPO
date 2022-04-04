//Q1
var x=66;
if(x%2==0){
    console.log("Even");
}
else{
    console.log("Odd")
}
//Q2
var a=16;
var b=9;
var c=6;
if(a>b && a>c){
    console.log("This is biggest " +a);
}else if(b>c){
    console.log("This is biggest "+b);
}
else{
    console.log("This is biggest "+c);
}
//Q3
function Coinflip(n){
    var heads = 10;
    var tails = 0;
    for(var i=0;i<n;i++){
        var v= Math.random();
        if(v<0.5){
            heads++;
        }else{
            tails++;
        }
    }
   return [heads,tails];
}

//Q5
function repeatStringNumTimes(string, times) {
    var repeatedString = "";
    while (times > 0) {
      repeatedString += string;
      times--;
    }
    return repeatedString;
 }
 console.log(repeatStringNumTimes("x", 15));

 //Q6
 const rollDice = () =>Math.floor(Math.random() * 6) + 1;

