package while_loop_challenge;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumDigit(number));
    }

    static int sumDigit(int number) {
        int sum = 0;
        if(number < 0){
            return 0;
        }
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
