package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We use Exception to handle error
        // exception is not an error
        // is happened when we run code
        // Some of a problem that we can handle

        // user input invalid data
        // file needing can't found
        try{
            System.out.print("Input Name : ");
            String name = new Scanner(System.in).nextLine();
            for(int z = 33 ; z < 65; z++){
                if(name.contains(String.valueOf((char)z))){
                    throw new Exception("No");
                }
            }
        }catch(Exception d) {
            System.out.println(d.getMessage());
        }

        try {
            int result = 10 / 0; // This causes an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

    }
}




