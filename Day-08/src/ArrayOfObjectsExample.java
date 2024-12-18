class Student {
    // Fields
    String name;
    int age;
    String grade;
    char gender;

    // Constructor
    public Student(String name, int age, String grade, char gender) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }

    // toString() method to display student information
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "', gender=" + gender + "}";
    }
}

public class ArrayOfObjectsExample {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3]; // Array to hold 3 students

        // Initialize each Student object
        students[0] = new Student("Alice", 20, "A", 'F');
        students[1] = new Student("Bob", 22, "B", 'M');
        students[2] = new Student("Charlie", 21, "A", 'M');

        // Display all students using a loop
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
