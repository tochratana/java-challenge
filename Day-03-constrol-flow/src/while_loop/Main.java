package while_loop;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (n < 50){
            n += 5;
            if (n % 25 == 0){
                continue;
            }
            System.out.print(n + "_");
        }

    }
}
