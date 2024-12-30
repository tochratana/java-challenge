import java.util.Scanner;

public class ConvertMinutAndHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Hours : ");
        int hours = scanner.nextInt();
        System.out.print("Input Minutes : ");
        int minuts = scanner.nextInt();
        while (minuts > 60){
            System.out.println("Invalid Minutes");
            System.out.print("Input Minutes : ");
            minuts = scanner.nextInt();
        }
        System.out.print("Input second : ");
        int secondInput = scanner.nextInt();
        while (secondInput > 60){
            System.out.println("Invalid Second");
            System.out.print("Input second : ");
            secondInput = scanner.nextInt();
        }

        int total = ConvertToSecond(minuts) + ConvertToSecondWithHours(hours) + secondInput;
        System.out.println("This is a minutes convert to second : " + total + "s");
        System.out.println("-".repeat(50));

        // this is a statement to input second and convert it to hour and minutes
        System.out.print("Input Second : ");
        int second = scanner.nextInt();
        System.out.println("The hours is : " + ConvertToHours(second) + "h  " +ConvertMinuts(second) +  "mn  " + ConvertSeconds(second) + "s");

    }
    public static int ConvertToSecond (int minuts) {
        return minuts * 60;
    }
    public static int ConvertToSecondWithHours(int hours){
        return hours * 3600;
    }


    // use for convert total second to hours, minutes and second
    public static int ConvertToHours(int second){
        return second / 3600;
    }
    public static int ConvertMinuts(int second){
        return (second % 3600) / 60;
    }

    public static int ConvertSeconds(int second){
        return second % 60;
    }
}
