package java02;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        BankAccount a = new BankAccount();
        
        a.setName("John");
        a.setBalance(5000);
        a.Report();
        CheckingAccount randomReport = new CheckingAccount();
        randomReport.Report();
        SavingsAccount danielReport = new SavingsAccount();
        danielReport.Report();


    }
}