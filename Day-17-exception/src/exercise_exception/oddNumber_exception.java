package exercise_exception;


import java.util.Scanner;

class oddNumberException extends Exception {
    public oddNumberException(String message) {
        super(message);
    }
}

public class oddNumber_exception {


    public void tryNumber(int value){
        try{
            if (value % 2 != 0) {
                throw new oddNumberException("Number is Odd");
            }
        }catch(oddNumberException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        oddNumber_exception test = new oddNumber_exception();
        test.tryNumber(5);
    }
}
