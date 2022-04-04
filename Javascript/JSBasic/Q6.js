//Q6
var num = prompt("Enter Number:");
var operation = prompt("Enter + for sum * for product")
var x = 0;
if(operation=="+"){
    for(i=1;i<=num;i++){
        x=x+i;
    }
document.write("Sum of number is "+num+"="+x); 
}
else if(operation=="*"){
    x=1;
    for(i=1;i<=num;i++){
        r=r*i;
    }
document.write("Product of number is "+num+"="+x); 
}
else{
    document.write("Read the question again");
}