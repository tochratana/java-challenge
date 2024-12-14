import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main of Java");
        int[][] twoD = {{1,5,7},{3,8,4},{4,5,56}};

        System.out.println(twoD[2][1]);

        System.out.println(Arrays.deepToString(twoD));
        for(int i = 0 ; i < twoD.length ; i++ ){
            for(int j = 0 ; j < twoD[i].length ; j++){
                System.out.println("twoD [" + i + "]["+j+"] = " + twoD[i][j] + "  |  ");
            }
        }
        System.out.println("-".repeat(20));


        // we use fill to add value to array
        int[][] fileArrays = new int[2][];
        fileArrays[0] = new int[3];
        fileArrays[1] = new int[3];
        Arrays.fill(fileArrays[0],1);
        Arrays.fill(fileArrays[1],5);
        System.out.println(Arrays.deepToString(fileArrays));


        System.out.println("-".repeat(20));

        // access value from array 2D using for each loop
        int[][] array2D = new int[2][];
        array2D[0] = new int[2];
        array2D[1] = new int[2];

        Arrays.fill(array2D[0],10);
        Arrays.fill(array2D[1],20);

        for(int[] itemOfArray : array2D){
            for(int i = 0 ; i < itemOfArray.length ; i++){
                System.out.println("This is a item of array : " + itemOfArray[i]);

            }

        }
    }
}
