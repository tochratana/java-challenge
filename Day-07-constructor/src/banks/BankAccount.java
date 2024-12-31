package banks;

public class BankAccount {
    String accountNumber;
    String accountHolder;

    double balance;
    static String bankName = "ABC Bank";


    BankAccount(){};

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit method uses for add money to the account balance
    void deposit(double amount){
        balance -= amount;
        System.out.println("Successfully deposited $" + amount);
    }

    // withdraw use for deducted money from a balance account if sufficient funds are available.
    void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        }else {
            System.out.println("Insufficient funds! Withdrawal failed.");
        }
    }

    // display account detail use for display all account bank
    void displayAccountDetails(){
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ABA Bank","1234",1000);
        account1.displayAccountDetails();
        System.out.println("-".repeat(20));

        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("-".repeat(20));
        account1.displayAccountDetails();


    }

}
