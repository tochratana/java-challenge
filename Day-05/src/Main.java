class Student {
    // Data Member
    String name;
    int age;
    char sex;
    static String school = "XYZ Height School"; // Static variable (shared)

    // Method / behavior / function
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gander : " + sex);

    }
}

public class Main {
    public static void main(String[] args) {

        // Create Object
        Student student1 = new Student();
        student1.name = "Toch Ratana";
        student1.age = 23;
        student1.sex = 'M';

        Student student2 = new Student();
        student2.name = "Kong Dara";
        student2.age = 19;
        student2.sex = 'M';


        // Access and display data members
        student1.displayInfo();
        System.out.println("-".repeat(20));
        student2.displayInfo();

        // Access static variable directly
        System.out.println("-".repeat(20));
        System.out.println("School for all Student : " + Student.school);




    }
}