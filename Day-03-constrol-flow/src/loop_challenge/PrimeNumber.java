package loop_challenge;

public class PrimeNumber {
    public static void main(String[] args) {

        int count = 0 ;
        for(int i = 1 ; i <= 100 ; i++){
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if(count == 3){
                    System.out.println("Found 3, Exiting loop");
                    break;
                }
            };
        }
        System.out.println("Total of prime number between 1 and 100: " + count);
    }
    static boolean isPrime(int n) {
        if ( n <= 2){
            return ( n == 2);
        }
        for(int divisor = 2 ; divisor <= n / 2 ; divisor++){
            if (n % divisor == 0) {
                return false;
            }

        }
        return true;
    }
}
