import java.util.Scanner;

public class OperatorInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = -1; // Tracks the current index in the array
        int[] arr = new int[100]; // Define an array with a fixed size

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.print("Input Option: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    if (i < arr.length - 1) { // Check if the array has space
                        i++;
                        System.out.print("Add item to Array (arr[" + i + "]): ");
                        arr[i] = scanner.nextInt();
                    } else {
                        System.out.println("Array is full! Cannot add more items.");
                    }
                    break;

                case 2:
                    System.out.println("Array Contents:");
                    for (int j = 0; j <= i; j++) {
                        System.out.println("arr[" + j + "] = " + arr[j]);
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    scanner.close(); // Close the scanner
                    System.exit(0);

                default:
                    System.out.println("Invalid Option! Please try again.");
            }
        }
    }
}
