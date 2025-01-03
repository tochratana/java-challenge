package loop_challenge;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 121; // Change this number to test

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit
            number = number / 10; // Remove the last digit
        }

        // Check if the reversed number matches the original number
        return originalNumber == reversedNumber;
    }
}
