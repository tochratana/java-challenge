package static_vs_instance;

class example {
    static int a = 10;
    int b = 20;

    public example() {

    }

    static void static_method(){
        System.out.println("This is a static method");

    }

    void instance_method(){
        b = 50;

        System.out.println("This is an instance method");
    }

    example(int a, int b){
        example.a = a;

    }
}

public class data_member {

    // instance data member, call without creating an object
    public static void main(String[] args) {

        example examples = new example();


        example.static_method();
        examples.instance_method();
        System.out.println("a : " + example.a);
        System.out.println("b : " + examples.b);
    }
}
