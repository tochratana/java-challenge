package banking;
class Account implements Banking {
    private double cash;
    private String accountName;

    void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    String getAccountName() {
        return accountName;
    }
    void getAccountNumber() {}

    double getCash() {
        return cash;
    }

    void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public void deposit(double amount) {
        if( amount < 0) {
            System.out.println("You don't have enough money to deposit");
        }
        else {
            this.cash += amount;
            System.out.println("You deposit is successful");
        }

    }

    @Override
    public void withdraw(double amount) {
        if ( amount > cash ) {
            System.out.println("You do not have enough money to withdraw");
        }
        else {
            this.cash -= amount;
            System.out.println("Your withdraw is successful");
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Your account balance is $" + this.cash);
    }
}