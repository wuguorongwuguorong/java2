package java02;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount()
    {
        super();
        interestRate = 0;
    }
    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
        System.out.println(name + balance + interestRate);
    }



    public void applyInterest() {
        balance += balance * interestRate;
        System.out.println("Interest applied. New balance: " + balance);
    }

    public void Report(){
      
        System.out.println("Name" + name + "Balance: " + balance + "Interest Rate: " + interestRate);

    }
}