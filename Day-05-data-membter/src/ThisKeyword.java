class Students {
    String name;
    int age;

    // Constructor 1: No arguments
    Students() {
        this("Unknown", 18); // Calls Constructor 2
    }

    // Constructor 2: With arguments
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


// new class
class Example{
    Example(){
        System.out.println("This is an example of constructor!");
    }
    public static void hell(){
        System.out.println("this is a method");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Students s1 = new Students(); // Calls Constructor 1
        //Students s2 = new Students("Ratana", 20); // Calls Constructor 2

        s1.display(); // Output: Name: Unknown, Age: 18
        //s2.display(); // Output: Name: Ratana, Age: 20

        // class example
        Example examples = new Example();
        Example.hell();
    }
}


// `synchronized` if block code using synchronized it will be run first when we use thread