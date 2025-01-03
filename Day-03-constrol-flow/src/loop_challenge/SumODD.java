package loop_challenge;

public class SumODD {
    public static void main(String[] args) {
        sumOdd(10,20);
    }

    static boolean isOdd(int number) {
        if(number == 0 || number == 1){
            return false;
        }
        if(number % 2 == 0) {
            return false;
        }
        return true;
    }

    static void sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println("this is odd " + i);
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
