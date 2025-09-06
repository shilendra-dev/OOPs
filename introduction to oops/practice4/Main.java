package practice4;
import java.util.Scanner;

//Your code goes here

class BankAccount {
    private String accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n", balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        // Input account number and initial balance
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        // Create a BankAccount object with the use of parameterised constructor
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    }
}