package banking;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class NewAccount extends Account {
    private String newAccountNumber;

    @Override
    void setCash(double cash) {
        super.setCash(cash);
    }

    @Override
    void setAccountName(String accountName) {
        super.setAccountName(accountName);
    }

    void newAccount() {
        System.out.println("Your account name is " + getAccountName());
        System.out.println("New account number: " + newAccountNumber);
        System.out.println("Your account now : $" + super.getCash());
    }
}
