package polymorphism;

public class compile_time_method_overloading {
    // The same method name can perform different tasks based on its parameters or data type.
    Integer a,b,c;

    Integer add (Integer a, Integer b){
        return a + b;
    }
    Integer add(Integer a, Integer b, Integer c){
        return a + b + c;
    }

    public static void main(String[] args) {
        compile_time_method_overloading compileTimeMethodOverloading = new compile_time_method_overloading();

        System.out.println(compileTimeMethodOverloading.add(10,20));
        System.out.println(compileTimeMethodOverloading.add(20,30,40));
    }

}
