package challenge_switch_case;

import java.util.Scanner;

public class NumberOfDayInMonth {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean leapYear(int year){
        if(year < 1 || year > 9_999){
            return false;
        }

        if(year % 4 == 0){
            if(year % 100 != 0){
                return true;
            }
            if(year % 400 == 0){
                return true;
            }else return false;
        }

        return false;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(year + " is a leap year? " + isLeapYear(year));
        scanner.close();
        System.out.println(leapYear(year));
    }
}

