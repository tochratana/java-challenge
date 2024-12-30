import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Width : ");
        double width = scanner.nextInt();
        System.out.print("Input Height : ");
        double height = scanner.nextInt();
        double area = width * height;
        double perimeter = 2*(width+height);
        System.out.println("Perimeter : "+perimeter);
        System.out.println("Area is : "+area);

    }
}
