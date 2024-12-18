package getAndSet;

import java.util.Random;

public class Student {

    private String firstName;
    private String lastName;
    private Integer id;
    private Character sex;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", sex=" + sex +
                '}';
    }

    Student(String firstName, String lastName, Integer id, Character sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.sex = sex;
    };




    void setId(Integer id){
        this.id = id;
    }
    Integer getId(Integer id){
        return id;
    }

    public static void main(String[] args) {
        Student[] students = new Student[2];


        // if we create like this, get only one object, but if we create an array object will get a multi object
        Student student = new Student("Toch","Ratana",new Random().nextInt(100),'M');
        System.out.println(student);

    }
}
