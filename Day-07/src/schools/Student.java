package schools;

public class Student {
    String name;
    int age;
    double grade;

    // Constructor Student class and Initialize all variable

    Student(String name , int age, double grade){
        this.name = name ;
        this.age = age ;
        this.grade = grade;
    }
    Student(){};



    // method to display
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student("John", 20, 85.5);
        student.display();
        System.out.println("-".repeat(20));
        Student student1 = new Student("Jane Smith",22,90.0);
        student1.display();
    }
}
