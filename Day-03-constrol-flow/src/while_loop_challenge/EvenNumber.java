package while_loop_challenge;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input start number : ");
        int start = scanner.nextInt();
        System.out.print("Input end number : ");
        int end = scanner.nextInt();

        System.out.println("----Event Number----");
        printEvenNumber(start, end);

    }
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    static void printEvenNumber(int start, int end) {
        int count = 0;
        int odd = 0;
        while (start <= end) {
            if (isEven(start)) {
                System.out.println("This number is even : " + start);
                count++;
            }
            if(!isEven(start)) {
                odd++;
            }
            if (count == 5){
                System.out.println("-----Found 5 numbers-----");
                System.out.println("Total of Event number : " + count);
                System.out.println("This number is odd : " + odd);
                break;
            }
            start++;
        }
    }
}
