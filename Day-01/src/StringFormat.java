import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println("This is a new file in git");
        System.out.println("We have a lot of ways to add string with value of variable");
        // String.format() method or System.out.printf();
        // - String %s
        // - int    %d
        // - double or float %f we can use %0.2f for two comma number or whatever until full comma number 6
        System.out.print("Input your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("This is my name : %s \n",name);


        System.out.print("Input Decimal Number : ");
        double decimal = new Scanner(System.in).nextFloat();
        System.out.printf("This is a decimal number : %.3f \n" , decimal);



        String welcome = "Welcome! this is my personal profile";
        System.out.printf("greeting : %s" , welcome);


        int num = 42;
        System.out.printf("Decimal: %d\n", num);        // 42
        System.out.printf("Hexadecimal: %x\n", num);    // 2a
        System.out.printf("Octal: %o\n", num);



        System.out.print("Input your age : ");
        int age = new Scanner(System.in).nextInt();
        System.out.printf("My name is %s and age is %d",name, age);
        // Placeholder with format specifier



    }
}
