import java.util.Arrays;
import java.util.Scanner;
public class ArrayFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int[] arr = new int[3];
        int i = -1;
        while (running){

            if ( i < 0){
                System.out.println("1. Add\n7. Exit");
            }else {
                System.out.println("1. Add\n2. Display\n3. Delete\n4. Search\n5. Insert\n6. Update\n7. Exit");
            }
            System.out.print("Input Choose : ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    i++;
                    for(int j = 0 ; j < arr.length ; j++){
                        if ( arr[i] != arr[j]){
                            System.out.print("arr["+i+"]=");
                            arr[i] = scanner.nextInt();
                            System.out.println("The first step" + i);
                            i--;
                            break;
                        }else {
                            System.out.print("arr["+i+"]=");
                            arr[i] = scanner.nextInt();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Display Of Array : ");
                    for(int j = 0 ; j < arr.length ; j++){
                        System.out.println("arr["+j+"]="+arr[j]);
                    }
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting Program");
                    break;
                default:
                    System.out.println("Invalid Your Choose!");
                    break;
            }





        }
    }
}
