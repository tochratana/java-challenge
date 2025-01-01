package challenge_switch_case;

public class Main {
    public static void main(String[] args) {
        char charValue  = 'X';

        switch(charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is backer");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println( charValue + " is not found");
        }
    }
}
