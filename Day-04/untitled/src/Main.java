public class Main {
    public static void main(String[] args) {
        System.out.println("This is main method");
        greeting();
        new NoneStatic().reply();
        System.out.println(new NoneStatic().lname("KOKO"));
    }

    // New method that have static key word
    public static void greeting(){
        System.out.println("Hello, this is a method that have static key word");
    }

    // New method that don't have static key word


    // difference between method with static keyword and not-static keyword
    // - static keyword

}
