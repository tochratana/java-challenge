package loop_challenge;

public class LastDigitChecker {
    static boolean hasSameLastDigit(int a , int b, int c){
        while (a > 0){
            int digit = a % 10;
            a /= 10;
        }
        return true;
    }
}
