package loop_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class SumFiveNumber {
    public static void checkSumFiveNumber() {
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[5];
        System.out.println("Input 5 Number ");
        for(int i = 0 ; i< numbers.length ; i++){
            System.out.print("Input " + i + " number ");
            numbers[i] = scanner.nextFloat();
            if(numbers[i] % 1 != 0){ // it a decimal number
                do {
                    System.out.println("You input decimal, please try again");
                    System.out.print("Input " + i + " number ");
                    numbers[i] = scanner.nextFloat();
                }while(numbers[i] % 1 != 0);

            }
        }
        float sum = 0;
        for(float item : numbers){
            sum += item;
        }
        System.out.println("Sum of 5 numbers is " + Arrays.toString(numbers));
        System.out.println("Sum of 5 numbers is " + sum);

    }
    public static void main(String[] args) {
        checkSumFiveNumber();
    }
}
