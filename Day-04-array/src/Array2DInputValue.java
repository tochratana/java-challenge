import java.util.Arrays;
import java.util.Scanner;

public class Array2DInputValue {
    public static void main(String[] args) {
        System.out.print("Input row : ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Input column : ");
        int column = new Scanner(System.in).nextInt();
        String[][] name = new String[row][column];

        for(int  i = 0 ; i < name.length ; i++){
            for(int j = 0 ;  j < name[i].length ; j++) {
                System.out.print("name ["+i+"]["+j+"] = ");
                name[i][j] = new Scanner(System.in).nextLine();
            }
        }

        System.out.println(Arrays.deepToString(name));
    }
}
