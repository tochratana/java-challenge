package loop_challenge;

public class EvenDigitSum {
    public static void main(String[] args) {
        int number = 34535;

        int result = evenDigitSum(number);
        System.out.println(result);
    }
    static int evenDigitSum(int a){
        int sum = 0;
        while ( a > 0){
            int last = a % 10;
            sum += last;
            a /= 10;
        }
        return sum;
    }
}
