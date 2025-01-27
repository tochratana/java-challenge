package check_exception;

import java.util.InputMismatchException;
import java.util.Scanner;


class InputGrather10 extends Exception {
    public InputGrather10(String message) {
        super(message);
    }
}

// input email invalid
class EmailInvalidException extends Exception {
    public EmailInvalidException(String message) {
        super(message);
    }
}

// check exception must be handle when we write code

public class Main {
    public static void main(String[] args) {

        try{
            String email = new Scanner(System.in).nextLine();
            if(!(email.contains("@gmail.com"))) {
                throw new EmailInvalidException("Email is invalid");
            }
        }catch (EmailInvalidException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.print("Input Number fro 0 to 10 : ");
            int number = new Scanner(System.in).nextInt();
            if(number < 0 && number > 10){
                throw new InputGrather10("You input grathert then 10");
            }
        }catch (InputGrather10 e) {
            System.out.println(e.getMessage());
        }
    }


}
