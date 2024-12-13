import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int n1 = scanner.nextInt();
        System.out.print("Input Second Number : ");
        int n2 = scanner.nextInt();
        System.out.print("Input Third Numer : ");
        int n3 = scanner.nextInt();
        System.out.println("Average of three number : " + (n1+n2+n3)/3);


    }
}
