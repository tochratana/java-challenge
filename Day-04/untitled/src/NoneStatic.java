public class NoneStatic {
    public static void main(String[] args) {
        String result = new Calculator().welcome("ABA Company");
        System.out.println(result);

    }
    public void reply(){
        System.out.println("Hello sir , this is a method that don't have static key word ");
    }

    protected String lname(String lname){
        return "His name is :" + lname;
    }



}

