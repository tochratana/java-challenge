class Person {

    Integer password;
    String name;

    Person(String name, Integer password){
        this.name = name;
        this.password = password;
    }

}

class ChildPerson extends Person {

    ChildPerson(){
        super(null,null);
    };

    ChildPerson(String name, Integer password){
        super(name,password);
    }

    void output(){
        System.out.println("Process finished with exit code 0");
    }

}


public class Data {
    public static void main(String[] args) {

        ChildPerson childPerson = new ChildPerson();
        childPerson.name = "Toch Ratana ";
        childPerson.password = 1234;

        System.out.println(childPerson.name + childPerson.password);
        childPerson.output();

    }

}
