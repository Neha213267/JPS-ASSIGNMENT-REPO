class Account{
    constructor(id,name,balance){
        this.id=id;
        this.name= name;
        this.balance = balance;
    }
}
class SavingAccount extends Account{
   constructor(id,name,balance,interest){
          super(id,name,balance);
          this.interest  = interest;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance + (this.balance*this.interest);
       return this.totalBalance;
   }
}

class CurrentAccount extends Account{
   constructor(id,name,balance,cash_credit){
          super(id,name,balance);
          this.cash_credit  = cash_credit;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance -this.cash_credit;
       return this.totalBalance;
   }
}

var SavingAccountObj = new SavingAccount(11,"neha",9000,10);
console.log(SavingAccountObj.getBalance());

var CurrentAccountObj = new CurrentAccount(11,"riri",70000,100);
console.log(CurrentAccountObj.getBalance());