class BankAccount {
    protected String firstName;
    protected String lastName;
    protected double balance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance; 
    }
    public BankAccount(){
        firstName = "N/A";
        lastName ="N/A"; 
        balance = 0;
    }
    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
class Book{
    private String title;
    private int numberOfPages;
    private double cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.setFirstName("Jon");
        a.setLastName("Snow");
        a.setBalance(500);
        System.out.println(a.getFirstName() + " " + a.getLastName() + " " + a.getBalance());

        BankAccount account2 = new BankAccount("Ivan", "Terrible", 3000);
        System.out.println(account2.getFirstName() + " " + account2.getLastName() + " - " + account2.getBalance());

    }
}
