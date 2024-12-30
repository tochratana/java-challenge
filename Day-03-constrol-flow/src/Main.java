public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Array in Java");
        // array is a multiple value in the same type.

        // key feature of array
        // Fixed size : size of array is define when we create an array and can't change

        // Declaration an array :
        int[] number ; //Preferred syntax
        number = new int[5]; // assign size to array
        int numbers[] = {1,2,3,4,5}; // // Alternate syntax
        for (int index : numbers){
            System.out.println(index);
        }

        int[] user = new int[5]; // declaration and initialize size to array

        int[] student = {10, 20, 30, 40, 50}; // declaration and initialize value to array

        // we can access a value from array using index that index start from 0


        int[] array = {1,2,3,4,5};
        for(int item : array){
            System.out.println(item);
        }

        // we can update array by assign new value to array
        int[] arrayStudent = {10,20,30,40};
        arrayStudent[0] = 20;
        for(int index : arrayStudent){
            System.out.println(index);
        }

        // remove item from array

        int[] arrayTeacher = {10,20,30,40,50};
        int indexToRemove = 2;

        int[] newArrayTeacher = new int[arrayTeacher.length-1];
        for(int i = 0 ,j = 0; i < arrayTeacher.length; i++){
            if( i == indexToRemove){
//                arrayTeacher
                newArrayTeacher[j++] = arrayTeacher[i];

            }
            System.out.println("");
        }

//        System.out.println(arrayTeacher.length);
//        System.out.println(newArrayTeacher.length);
//        for(int indexNew : newArrayTeacher){
//            System.out.println(indexNew);
//        }
    }
}
