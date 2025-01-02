package loop_statement;

public class PrintInteres {
    public static void main(String[] args) {

        for(int counter = 1; counter <= 10; counter++){
            System.out.println(counter);
        }

        for(double rate = 2.0 ; rate <= 5.0 ; rate++){
            System.out.println("10,000 at " + rate + "% interest " + calculateInterest(10_000, rate));
            System.out.println(rate);
        }

        System.out.println(calculateInterest(45,30));

    }
    static double calculateInterest(int amount, double interest) {
        return amount * (interest / 100);
    }
}
