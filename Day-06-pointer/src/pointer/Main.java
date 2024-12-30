package pointer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.displayCaseBefore();
        while (true){
            System.out.print("Input Number : ");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1:
                    operator.add(0);
                    break;
                case 2:
                    operator.display();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
            operator.displayCaseAfter();

        }

    }
}
