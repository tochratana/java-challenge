package example_oop;

public class Student {
    String name;
    Integer age;
    String grade;

    Student (String name, Integer age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void study () {
        System.out.printf("Student %s is studying\n" , name);
    }

    void takeExam () {
        System.out.printf("Student %s has taken the exam and got a grade : %s" , name, grade);
    }

    public static void main(String[] args) {
        Student student = new Student("Toch Ratana" , 19, "B");
        student.study();
        student.takeExam();
    }


}
