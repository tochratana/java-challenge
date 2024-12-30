import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        System.out.print("Input size of array : ");
        int sizeArray = new Scanner(System.in).nextInt();

        int[] array = new int[sizeArray];


        // input all item to array
        for(int i = 0  ; i < array.length ; i++){
            System.out.print("array [" + i + "] = ");
            array[i] = new Scanner(System.in).nextInt();
        }


        // print all element in array
        for(int item : array){
            System.out.println("array item : " + item);
        }

        //compute sum of array element
        int sum = 0 ;
        for (int j : array) {
            sum += j;
        }
        System.out.println("This is a sum of array : " + sum);

        // average of sum array
        float average = (float)sum / array.length;
        System.out.println("This is a array : " + average);

    }
}
