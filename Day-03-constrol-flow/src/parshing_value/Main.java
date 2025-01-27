package parshing_value;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;
        String userDateOfBirth = "2006";
        System.out.println("Age : " + (currentYear - Integer.parseInt(userDateOfBirth)));
        String weight = "1.2";
        System.out.println("Weight : " + Double.parseDouble(weight) + "Kg");
        Console console = System.console();
        String input = console.readLine();
    }
}
