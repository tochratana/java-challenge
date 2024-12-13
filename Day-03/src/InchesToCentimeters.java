import java.util.Scanner;
public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input INCHES : ");
        double inches = scanner.nextDouble();
        System.out.print("Input FEET : ");
        double feet = scanner.nextDouble();

        System.out.println(inches + " inch : " + inchesToCentimeTer(inches) + "cm");
        System.out.println(inches + " in" +feet+ " feet : " + inchesToCentimeTer(inches , feet)+ "cm");

    }
    public static double inchesToCentimeTer(double inch){
        return inch * 2.54 ;
    }
    public static double inchesToCentimeTer(double inch,double feet){
        return ((feet * 12)+inch)*2.54 ;
    }
}
