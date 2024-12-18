import java.util.ArrayList;
import java.util.List;

// Professor class (part)
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class (whole)
class Department {
    private String departmentName;
    private List<Professor> professors; // Aggregation relationship

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.professors = new ArrayList<>();
    }

    // Add a professor to the department
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    // Display department and its professors
    public void showProfessors() {
        System.out.println("Department: " + departmentName);
        for (Professor professor : professors) {
            System.out.println("Professor: " + professor.getName());
        }
    }
}

// Main class to demonstrate Aggregation
public class Aggregation {
    public static void main(String[] args) {
        // Create professors
        Professor prof1 = new Professor("Prof. John");
        Professor prof2 = new Professor("Prof. Smith");

        // Create a department
        Department csDepartment = new Department("Computer Science");

        // Associate professors with the department
        csDepartment.addProfessor(prof1);
        csDepartment.addProfessor(prof2);

        // Display details
        csDepartment.showProfessors();
    }
}
