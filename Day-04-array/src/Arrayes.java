import java.util.Scanner;
import java.util.Arrays;

public class Arrayes {
    public static void main(String[] args) {
        String[] allArray = new String[5];
        for(int i = 0 ; i < allArray.length ; i++){
            System.out.print("Input allArrays [" + i + "] = ");
            allArray[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("-".repeat(20));

        Arrays.stream(allArray).forEach(
                e -> System.out.println("His name is " + e)
        );
        System.out.println("-".repeat(20));
        Arrays.stream(allArray).filter(
                i -> i.startsWith("s")).forEach(
                        j -> System.out.println("This is a name that start with letter 's' : " + j));
        ;

    }
}
