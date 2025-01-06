package banking;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Account user1 = new Account();
        CreditAccount creditAccount = new CreditAccount("123456789",new Date(),"668");
        System.out.println("Your Account now : " + user1.getCash());
        System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. createCreditAccount\n5. Exit");
        boolean running = true;
        while (running) {
            System.out.println("-".repeat(30));
            System.out.print("Enter your choice : ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to deposit : ");
                    double depo = new Scanner(System.in).nextDouble();
                    user1.deposit(depo);
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw : ");
                    double withd = new Scanner(System.in).nextDouble();
                    user1.withdraw(withd);
                    break;
                case 3:
                    user1.showBalance();
                    break;
                case 4:
                    System.out.print("Enter the account name : ");
                    String account = new Scanner(System.in).nextLine();
                    System.out.println("Your account create is successful");
                    NewAccount newAccount = new NewAccount();
                    newAccount.setNewAccountNumber(UUID.randomUUID().toString());
                    newAccount.setAccountName(account);
                    System.out.println("=".repeat(20));
                    newAccount.newAccount();
                    System.out.println("=".repeat(20));
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using your account.");
                    break;
            }
        }
    }
}
