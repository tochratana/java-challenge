package example_oop;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }



    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (Double balance) {
        this.balance = balance;
    }


    // methods to compute and display
    public double deposit (double amount) {
        return balance += amount;
    }

    public double withDraw (double amount) {
        return balance -= amount;
    }

    public double getBalances () {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deposit money : ");
        double deposit = scanner.nextDouble();
        System.out.print("Withdraw money : ");
        double withdraw = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = "123456789";
        bankAccount.accountHolder = "Toch Ratana";
        bankAccount.balance =  1000;



        // out put all money
        System.out.println("Account Holder : " + bankAccount.getAccountHolder());
        System.out.println("Account Number : " + bankAccount.getAccountNumber());
        System.out.printf("Balance : %.2f \n", bankAccount.getBalances());
        System.out.println("Deposited : " + deposit + " in account " + bankAccount.accountNumber + ".New balance : " + bankAccount.deposit(deposit));
        System.out.println("Withdrew : " + withdraw + " from account " + bankAccount.accountNumber + ".New balance : " + bankAccount.withDraw(withdraw));
        System.out.println("Insufficient balance for withdrawal.");
        System.out.println("Account Number " + bankAccount.getAccountNumber());
        System.out.println("Account Holder : " + bankAccount.getAccountHolder());
        System.out.println("Balance : " + bankAccount.getBalance());
    }
}
