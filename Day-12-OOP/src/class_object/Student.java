package class_object;

class Student { // class
    String name;
    int age;


    Student(){}; // constructor non-parameter

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    } // constructor with parameter

    void display() {
        System.out.println("His name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        Student student = new Student(); // object that instance from class
        student.name = "Toch Ratana";
        student.age = 18;
        student.display();

        Student student1 = new Student("Toch Ratana", 18);
        student1.display();
    }
}
