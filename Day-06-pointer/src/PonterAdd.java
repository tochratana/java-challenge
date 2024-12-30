import java.util.Scanner;

public class PonterAdd {
    public static void main(String[] args) {
        System.out.print("Enter : ");
        int sizeArray = new Scanner(System.in).nextInt();
        int[] arrayes = new int[100];

        for(int i = 0 ; i < sizeArray ; i++){
            System.out.print("arrayes ["+i+"] = ");
            arrayes[i] = new Scanner(System.in).nextInt();
        }
        System.out.print("Number of element to add : ");
        int numberAdd = new Scanner(System.in).nextInt();

        int conti = sizeArray + numberAdd;
//        arrayes = new int[conti];
        for(int i = sizeArray ; i < conti ; i++){
            System.out.print("arrayes ["+i+"] = ");
            arrayes[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("-".repeat(20));

        for(int i = 0 ; i < conti ; i++){
            System.out.println("arrayes ["+i+"] = " + arrayes[i]);
        }
    }
}
