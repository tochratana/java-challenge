package abstract_Interface.abstraction;


class Animal {
    Animal(String love) {
        System.out.println("Parent constructor called" + love);
    }


    void eat() {
        System.out.println("This dog is eating...");
    }
}

class Dog extends Animal {
    Dog() {
        super(" I love you");
        System.out.println("Child constructor starts");
        // Implicit super() is inserted here
        super.eat();
        System.out.println("Child constructor ends");
    }
}

public class Supper {
    public static void main(String[] args) {
        Dog child = new Dog();
        // Output:
        // Parent constructor called
        // Child constructor starts
        // This dog is eating...
        // Child constructor ends
    }
}

