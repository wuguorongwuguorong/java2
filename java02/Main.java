package java02;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        BankAccount a = new BankAccount();
        
        a.setName("John");
        a.setBalance(5000);
        a.Report();
        BankAccount randomReport = new CheckingAccount("Jon" , 5000 , 2000);
        randomReport.Report();
        BankAccount danielReport = new SavingsAccount("Daniel",5000,10);
        danielReport.Report();


    }
}
