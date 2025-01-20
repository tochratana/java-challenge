package loop_challenge;

//public class GreatestCommonDivisor {
//    public static int gcd(int a, int b) {
//        if (b == 0) return a;
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(gcd(12, 30));
//    }
//}
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first < second ? first : second;
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));

    }
}