package practice3;

class BankAccount{
    private String name;
    private double balance;

    //Default constructor
    public BankAccount(){
        this.name = "";
        this.balance = 0.0;
    }

    //Parameterized constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //Getter and Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) { 
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient funds");
            return false; // Insufficient funds
        } else{
            balance -= amount;
            return true; // Withdrawal successful
        }
    }
}

public class Main {
    
}
