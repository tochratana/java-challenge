//  1.True or False
//      a. Java Supports multiple inheritances or not?
//  2.Fill in the blanks
//      b. OOP full form
//      c. Functionality
//      c. Abstract methods
//      d. What are the override-definition
//
//  3.Multiple choices
//      a. JDK full form
//      b. How to declare array
//      c. How to declare name variable
//      d. OOP full form
//      e. Keyword used to create object
//  4.O&A
//      a. JKD definition ?
//      b. Type of methods
//      c. Categories of a data type in java
//      d. What is control flow ?
//      e. What the OOP principles are ? explain each?
// 5.Exercise
//      a. Create one something class
//      b. Create constructor with parameter and no parameter
//      c. One method for printing object details



package abstract_Interface.abstraction;

class Parent {
    String fatherName = "Phat Toch";
    void callChild () {
        System.out.println("Please, go home!");
    }

    Parent (String text) {
        System.out.println("Hey!, " + text);
    }
}

class Child extends Parent {
    // supper keyword, we can use it with call constructor from parents' class
    Child (){
        super("Ratana");
    }



    void replyParent () {
        System.out.println("I'm going back!");
        // We use supper keyword to access method from parents' class
        super.callChild();
        // We use supper keyword to access variable from parents' class
        System.out.println("My father name " + super.fatherName);
        // Default in this method

    }

}

abstract class Teacher {
    // abstract method is a methods that don't have a body
    // example :
    abstract void teach ();


    // concrete method is methods that have a body
    // example :
    void practice () {
        System.out.println("Teacher give some exercise to practice!");
    }
}

class Student extends Teacher {
    @Override
    void teach () {
        practice();
        System.out.println("Teacher teach student everyday!");
    }
}

public class Abs {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.teach();



        // Supper keyword
        Child firstChild = new Child();
        firstChild.callChild();
        System.out.println("-".repeat(30));
        firstChild.replyParent();


    }
}
