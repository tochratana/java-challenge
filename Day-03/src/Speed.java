import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[+] Insert Mile To Kilometer : ");
        double mile = scanner.nextDouble();
        double result = toMilesPerHour(mile);
        System.out.println(result);

        printConversion(mile);
        // print address
//        Integer a = 10;
//        System.out.println(System.identityHashCode(a));
//        a = 100;
//        System.out.println(System.identityHashCode(a));


    }
    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.60934);
    }

    public static void printConversion(double result){
        System.out.println(result + "km/h = " + Math.round(result/1.60934) + "mi/h");
    }
}
