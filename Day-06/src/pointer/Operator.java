package pointer;

import java.util.Scanner;

class Operator {
    public int i = -1;
    public int[] arr = new int[100];
    public void displayCaseBefore(){
        System.out.println("""
                1. Add
                7. Exit
                """);
    }

    public void add(int i){
        i++;
        System.out.print("arr ["+i+"] = ");
        arr[i] = new Scanner(System.in).nextInt();
    }
    public void display(){
        i++;
        for(int j = 0 ; j < i ; j++){
            System.out.print("arr ["+j+"] = " + arr[j]);
        }
    }

    public void displayCaseAfter(){
        System.out.println("""
                1. Add
                2. Display
                3. Update (index, number)
                4. Delete (index, number)
                5. Search
                6. Sort (large to small or small to large)
                7. Exit
                """);
    }
}
