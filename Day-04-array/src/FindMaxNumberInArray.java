import java.util.Scanner;

public class FindMaxNumberInArray {
    public static void main(String[] args) {
        System.out.print("Input size array : ");
        int size = new Scanner(System.in).nextInt();
        int[] arrays = new int[size];

        for(int i = 0 ; i < arrays.length; i++){
            System.out.print("arrays ["+i+"] = ");
            arrays[i] = new Scanner(System.in).nextInt();
        }
        int max = 0 ;
        for (int array : arrays) {
            if (max < array) {
                max = array;
            }
        }
        System.out.println("This is a maximum number : " + max);
    }
}
