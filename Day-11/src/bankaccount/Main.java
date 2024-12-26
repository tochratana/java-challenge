package bankaccount;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000);
        bobsAccount.setCustomerName("BOb");
        bobsAccount.setCustomerEmail("bob@gamil.com");
        bobsAccount.setCustomerPhone("088763434");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
    }
}
