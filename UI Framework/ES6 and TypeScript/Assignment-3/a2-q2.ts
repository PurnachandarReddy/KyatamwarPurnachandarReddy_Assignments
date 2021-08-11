class Account{
    id;
    name;
    balance;
    constructor(id,name,balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

}
class SavingsAccount extends Account{
    intrest;
    cashcredit;
    constructor(intrest,cashcredit)
    {
        super();
        this.intrest=intrest;
        this.cashcredit=cashcredit;
    }
}
class CurruntAccount extends Account{
    intrest;
    cashcredit;
    constructor(intrest,cashcredit)
    {
        super();
        this.intrest=intrest;
        this.cashcredit=cashcredit;
    }
   
}
let acc=new Account(101,"KPCReddy",10000);
console.log("Bank Details "+acc.id+" "+acc.name+" "+acc.balance);
let sav=new SavingsAccount(5,1000);
let cur=new CurruntAccount(7,1000);
function totalSavings() {
    return acc.balance+(sav.intrest*sav.cashcredit);
    
}
function totalCurrent() {
    return acc.balance+(cur.intrest*cur.cashcredit);
    
}
console.log("Savings account "+totalSavings());
console.log("Current account "+totalCurrent());