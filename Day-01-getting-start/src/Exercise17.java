import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int fNumber = scanner.nextInt();

        System.out.print("Input Second Number : ");
        int sNumber = scanner.nextInt();

        String fNumberToString = String.valueOf(fNumber);
        String sNumberToString = String.valueOf(fNumber);

        for (int i = 0; i < 2; i++) {
            char fNumberForDigit = fNumberToString.charAt(i);
            char sNumberForDigit = fNumberToString.charAt(i);
//            System.out.println(fNumberForDigit);
//            System.out.println(sNumberForDigit);
            int total = fNumberForDigit + sNumberForDigit;
            if (total > 1) {
                total = 0;
            }

        }
    }

}