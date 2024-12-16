class Constructor{
    int age;

    Constructor(){
        this.age = 20;
    }
    void display(){
        System.out.println("His age is : " + age);
    }
}

public class ExampleConstructor {
    public static void main(String[] args) {

        Constructor s = new Constructor();
        s.age = 30;
        s.display();


    }
}
