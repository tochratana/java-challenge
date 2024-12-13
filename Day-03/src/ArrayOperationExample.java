import java.util.Arrays;

public class ArrayOperationExample {
    public static void main(String[] args) {
        // 1. Create and initialize an array
        int[] numbers = {5, 3, 8, 6, 2, 7, 4};

        // 2. Print the array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 3. Search for an item using linear search
        int searchItem = 6;
        boolean found = false;
        for (int num : numbers) {
            if (num == searchItem) {
                found = true;
                break;
            }
        }
        System.out.println("Item " + searchItem + (found ? " is found." : " is not found."));

        // 4. Use Arrays class for binary search (requires a sorted array)
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, searchItem);

        // Check the result of binary search
        if (index >= 0) {
            System.out.println("Item " + searchItem + " found at index: " + index + " in sorted array.");
        } else {
            System.out.println("Item " + searchItem + " not found in the sorted array.");
        }
    }
}
