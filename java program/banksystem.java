class account{
    int accno;
    String name;
    float amount;
    void insert(int a,String n,float amt){
        accno=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }

    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }
        else{
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }

    void checkBalance(){
        System.out.println("Balance is: "+amount);
    }

    void display(){
        System.out.println(accno+" "+name+" "+amount);
    }
}

class banksystem{
    public static void main(String[] args){
        account a1=new account();
        account a2=new account();
        a1.insert(832345,"Ankit",1000);
        a2.insert(987979,"Sumit",5000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();

        a2.display();
        a2.checkBalance();
        a2.deposit(10000);
        a2.withdraw(50000);
        a2.checkBalance();

    }
}