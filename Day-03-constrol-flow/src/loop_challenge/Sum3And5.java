package loop_challenge;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                count++;
                System.out.println("Number can divide by 3 and 5: " + i);
                if(count == 5){
                    break;
                }
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
