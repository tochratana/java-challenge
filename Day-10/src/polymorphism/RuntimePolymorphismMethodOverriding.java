package polymorphism;

// Override Rule:
// Must be in a relationship (Inherit)
// Methods must be the same parameter, same, signature, same return type and as the parents
// Cannot override static and final methods
// When we override, we should use keyword. @Override

public class RuntimePolymorphismMethodOverriding {
    void greeting () {
        System.out.println();
    }
}

class First_class extends RuntimePolymorphismMethodOverriding {
    @Override
    void greeting () {
        System.out.println("This is a first Override");
    }
}

class SecondClass extends RuntimePolymorphismMethodOverriding {
    @Override
    void greeting () {
        System.out.println("This is a second Override");
    }


    public static void main(String[] args) {
        RuntimePolymorphismMethodOverriding first_class = new First_class();
        first_class.greeting();

        RuntimePolymorphismMethodOverriding second_class = new SecondClass();
        second_class.greeting();
    }

}
