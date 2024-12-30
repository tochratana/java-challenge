package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.drow();

        Shape circle1 = new Shape();
        circle1.drow();
    }
}
