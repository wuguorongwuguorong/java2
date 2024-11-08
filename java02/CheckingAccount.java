package java02;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount()
    {
        super();
        overdraftLimit = 2500;
    }

    public CheckingAccount(String name, double balance, double overdraftLimit) {
        super(name, balance);
        this.overdraftLimit = overdraftLimit;
        System.out.println(name + balance + overdraftLimit);
    }

    public void setOverDraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverDraftLimit() {
        return overdraftLimit;
    }

    public void Withdrawal(double amount){
        if(getBalance() - amount > overdraftLimit){
        setBalance(getBalance() - amount);
        }
    }
    public void Report(String name, double balance,double overdraftLimit){
        this.name = name;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        System.out.println("Name" + name + "Balance: " + balance + "Overdraft Limit: " + overdraftLimit);
    }
}
