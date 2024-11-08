package java02;

public class BankAccount {
    protected String name;
    protected double balance;

    public BankAccount(){
        name="N/A";
        balance=0;
    }

    public void Report(){
        System.out.println("N/A");
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

public void withdraw(double amount){
    if(balance - amount >= 0){
        balance = balance - amount;
    }
}

}
