import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.print("Input Factorial Number : ");
        byte a = new Scanner(System.in).nextByte();

        System.out.println("The result of factorial number : " + factorial(a));

    }
    public static int factorial(int a ){
        if ( a == 0){
            return 1;
        }
        return a * factorial(a-1); // 5 x 4 x 3 x 2 x 1
    }
}
