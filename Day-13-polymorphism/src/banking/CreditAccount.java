package banking;
import lombok.*;

import java.util.Date;
@Setter
@Getter
public class CreditAccount extends Account {
    private String cardNumber;
    private Date exspirdDate;
    private String cvv;

    public CreditAccount(String cardNumber,Date exspirdDate, String cvv) {
        this.cardNumber = cardNumber;
        this.exspirdDate = exspirdDate;
        this.cvv = cvv;
    }
    public CreditAccount(){};


    void displayCreditAccount() {
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Date of Birth: " + getExspirdDate());
        System.out.println("CVV: " + getCvv());
    }

    @Override
    void setAccountName(String accountName) {
        super.setAccountName(accountName);
    }
}
