package loop_challenge;

import java.util.ArrayList;
import java.util.List;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(sharedDigit(1, 23)); // Should return true
        System.out.println(sharedDigit(45, 67)); // Should return false
        System.out.println(sharedDigit(123, 456)); // Should return false
        System.out.println(sharedDigit(123, 321)); // Should return true
    }
    static boolean sharedDigit(int a,int b) {
        if(a<9 && a > 99){
            return false;
        }
        if(b<9 && b > 99){
            return false;
        }
        List<Integer> storeDigitA = new ArrayList<>();
        List<Integer> storeDigitB = new ArrayList<>();
        while (a > 0) {
            int lastDigit = a % 10;
            storeDigitA.add(lastDigit);
            a /= 10;
        }
        while (b > 0) {
            int lastDigit = b % 10;
            storeDigitB.add(lastDigit);
            b /= 10;
        }
        System.out.println(storeDigitA);
        System.out.println(storeDigitB);
        for(int digit : storeDigitA) {
            if(storeDigitB.contains(digit)) {
                return true;
            }
        }

        return false;
    }
}
