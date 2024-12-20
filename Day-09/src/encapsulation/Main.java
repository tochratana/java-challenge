package encapsulation;

// Encapsulation Example
class Employee {
    // Private fields
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Basic validation
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee emp = new Employee("John Doe", 30, 50000);

        // Accessing fields via getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

        // Modifying fields via setters
        emp.setName("Jane Doe");
        emp.setAge(35);
        emp.setSalary(60000);

        // Accessing updated fields
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Age: " + emp.getAge());
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}

