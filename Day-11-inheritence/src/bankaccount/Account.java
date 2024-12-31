package bankaccount;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;



    public void depositFunds (double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + "made. New Balance is " + balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("Insufficient founds! You only have $ " + balance + " in your account.");
        }else {
            balance -= withdrawalAmount;
            System.out.println("withdrawal of $ " + withdrawalAmount + " withdraw process, Remaining balance = $" + balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
