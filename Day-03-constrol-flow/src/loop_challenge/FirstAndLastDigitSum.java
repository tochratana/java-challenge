package loop_challenge;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int result = firstAndLastDigitSum(-90);
        System.out.println("The first and last digit sum is " + result);
    }

    static int firstAndLastDigitSum(int a){
        if(a < 0){
            return -1;
        }
        // last number
        int lastDigit = a % 10;
        int firstDigit = a;
        while (firstDigit >= 10){
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }

}
