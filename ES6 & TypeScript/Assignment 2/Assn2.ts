//Assignment 02  
//Q1 
// code to show the fibonacci series 
console.log("Question-1");

class Fibonacci{
    previousNo = Symbol();
    currentNo = Symbol();
    constructor(){
        this.previousNo=0;
        this.currentNo=1;
    }
    next(){
        let next = Symbol();
        next = this.previousNo + this.currentNo;
        this.previousNo=this.currentNo;
        this.currentNo=next;
        return next;
    }
}

let obj =new Fibonacci();
console.log("Here fibonacci series End");
console.log(obj.next()); 
console.log(obj.next()); 
console.log(obj.next()); 
console.log(obj.next());    

//2.	Iterators: Write a program that returns next Armstrong number after 
// calling getNextArmstrong() method.

const  listArmStrong=[0, 1, 153, 370, 371, 407];
const iterator = listArmStrong[Symbol.iterator]();
function getNextArmstrong(){
   
   return iterator.next().value;
}
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());


//Q3

//code to check a number is armstrong or not
function isArmstrong(number) {
    let sum = 0;
    let temp = number;
    while (temp > 0) {
        let digit = temp % 10;
        sum += digit ** 3;
        temp = Math.floor(temp / 10);
    }
    return (number == sum);
}
//Generator function tocall isArmstrong and reset the value of n if n is greater than 1000
function *getNextArmstrong1(){
    let i=0;
    while(true){
        if( isArmstrong(i)){
            yield i;
        }
        if(i>1000){
            i=0;
            yield "number is too larger";
        }
        i++;
    }
}
console.log("Armstrong numbers are : ");
console.log("using Generator");
var g = getNextArmstrong1();
console.log(g.next().value);
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value) // number is too larger 
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)


//Q4 :
//using set to store users
var chatroom1 = new Map();
var chatroom2 = new Map();
// adding users and messages
chatroom1.set("user1", ["Hello", "How are you?", "I am fine", "Thank you"]);
chatroom1.set("user2", ["Hi", "How was your day today?", "It was good", "Thank you"]);
chatroom1.set("user3", ["Heyy", "Wassup?", "It's cool", "Cool"]);
chatroom2.set("user4", ["Hey", "How was your weekend", "It was good, I went to the movies", "That's great"]);
chatroom2.set("user5", ["Namaste", "How are you?", "I am fine, Thank You"]);
chatroom2.set("user6", ["Heya", "Did you watch Avengers Endgame?", "Yeah! I was super syked..But now I am sad", "I know the feeling, Losing Stark was too much for us"]);
//printing users and messages
var printusers= (room: any[] | Map<any, any>,name: string)=>{
    console.log(`Users in room name  ${name} are : `);
    for(let key of room.keys()){console.log(key);}
}
var printmessages= (room: any[] | Map<any, any>,name: string)=>{
    console.log(`Messages in room name  ${name} are : `);
    for(let value of room.values()){console.log(value);}
}
printusers(chatroom1,"chatroom1");
printusers(chatroom2,"chatroom2");
printmessages(chatroom1,"chatroom1");
printmessages(chatroom2,"chatroom2");
