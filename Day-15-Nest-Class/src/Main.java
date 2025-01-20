class OuterClass {
    class InnerClass {
        void method() {
            System.out.println("Nest Class");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.method();

    }
}
