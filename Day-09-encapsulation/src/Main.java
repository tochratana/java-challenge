import java.util.Random;

// Inheritance (is-a relationship)
class Parents {
    String name;
    Integer age;

    Parents(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}

class Son extends Parents {
    Son (String name, Integer age){
        super(name,age);
    }
}

class Child extends Parents {
    String email;
    Integer id;

    Child (String email,Integer id,String name){
        super(name,0);
        this.email = email;
        this.id = id;
    }

    void eat(){
        System.out.println(name + " is eating pizza");
    }
}

class Dina extends Child {
    Dina(Integer id){
        super(null ,id, null);
    }

    int idGeneration (){
        return new Random().nextInt(1000);
    }

    void yourID (Integer id){
        System.out.println("Your id here : " + id);
    }

}

public class Main {
    public static void main(String[] args) {
        // class son
        Son son = new Son("Toch Ratana",19);
        System.out.println("His name is " + son.name);
        System.out.println("He is " + son.age);


        // class child
        Child child = new Child(null,null,"Ratana");
        child.eat();

        // class dina that, this class is extent from class child
        Dina dina = new Dina(0);
        int id = dina.idGeneration();
        dina.yourID(id);


    }
}
