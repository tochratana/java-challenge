public class Methods {
    static int a = 20 ;
    public static void main(String[] args){
        printA();

    }

    // if we declare a variable in methods like main, so we can't to access in another methods
    // to fix the variable we use Class-level (static) variable
    public static void printA(){
        System.out.println(a);

    }
}
