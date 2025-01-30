package continue_oop.animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic","Huge",400);
        doAnimalStaff(animal,"fast");

        Dog dog = new Dog();
        doAnimalStaff(dog,"slow");




    }

    public static void doAnimalStaff (Animal animal, String speed){
        animal.macknoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------");


    }
}
