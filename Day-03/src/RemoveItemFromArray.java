public class RemoveItemFromArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int indexToRemove = 2; // Remove the element at index 2 (value 30)

        // Create a new array with one less element
        int[] newArray = new int[numbers.length - 1];

        // Copy elements to the new array, skipping the element at indexToRemove
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = numbers[i];
            }
        }

        // Print the new array
        System.out.println("Array after removal:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
