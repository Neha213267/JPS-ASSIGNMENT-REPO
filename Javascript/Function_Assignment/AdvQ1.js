function isEven(num){
    if(num%2==0){
        return true;
    }
    else
        return false;
}
let arr=[1, 3, 5, 4];
function find(arr,func){
    for(var i=0;i,arr.length;i++){
        if(func(arr[i])==true)
            return arr[i];
        else{
            arr.shift();
            return(find(arr,func));
        }
    }

}
console.log(find(arr,isEven));
