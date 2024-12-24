package abstract_Interface;


interface Functionality {
    default void deposit(Double amountOfCashToDeposit) {}
    default void withdraw(Double amountOfCashToWithdraw) {}
    default void showBalance() {}
}

class Account implements Functionality {


    private String accountType;
    private Double amountOfCash;
    @Override
    public void deposit(Double amountOfCashToDeposit) {
        this.amountOfCash =
                (this.amountOfCash == null) ? 0D : (this.amountOfCash + amountOfCashToDeposit);

    }

    // Constructor 2:24:10 in OOP 1

    @Override
    public void withdraw (Double amountOfCashToWithdraw) {
        this.amountOfCash -= amountOfCashToWithdraw;
    }

    @Override
    public void showBalance () {
        System.out.printf("You %s account is : ", this.accountType + this.amountOfCash);
    }
    Functionality functionality = new Account();

}

public class Main {
}
