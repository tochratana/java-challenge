package loop_challenge;

import java.util.Scanner;

public class InvideYearOfBirth {
    public static void main(String[] args) {
        System.out.println(inputYearOfBirth());;


    }

    public static boolean checkInvideYearOfBirth(String year,int currentYear) {
        int yob = Integer.parseInt(year);
        return yob > 0 && yob <= currentYear;
    }

    public static int inputYearOfBirth() {
        Scanner scanner = new Scanner(System.in);
        int currentYear = 2025;
        String year;
        do {
            System.out.print("Enter year: ");
            year = scanner.nextLine();
        } while (!checkInvideYearOfBirth(year,currentYear ));
        return currentYear - Integer.parseInt(year);
    }
}
