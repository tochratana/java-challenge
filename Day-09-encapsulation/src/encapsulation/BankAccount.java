package encapsulation;

// We use encapsulation to
// - protect data: prevent direct access to the internal state of object
//Protect data: Prevent direct access to the internal state of an object, ensuring that data remains consistent and secure.
//Control access: Define how data can be accessed and modified through methods, allowing for validation and other logic to be applied.
//Increase flexibility: Modify the internal implementation of a class without affecting other parts of the code, as long as the public interface remains the same.


import javax.imageio.stream.ImageInputStream;

public class BankAccount {
    // Private instance variables (data encapsulation)
    private String accountNumber;
    private double balance;

    BankAccount(){};

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter method for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (controlled access to balance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (controlled access to balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = "10";
        bankAccount.balance = 10;
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.balance);
    }
}

