package car;

public class Car {
    String brand;
    String model;
    int year;
    double price;


    void startEngine(){
        System.out.printf("%s %s's engine started!",model,brand);
    }

    void stopEngine(){
        System.out.printf("%s %s 's engine stopped!",model,brand);
    }

    Car(){};
    Car(String model, String branch, int year, double price){
        this.model = model;
        this.brand = branch;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota","Camry",2022,30000.000);

        car.startEngine();
        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        car.startEngine();
    }
}
