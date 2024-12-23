package example_oop;

public class Car {
    String brand;
    String model;
    Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void start_engine () {
        System.out.printf("The engine of the %s %s has started.\n",brand, model);
    }

    void stop_engine () {
        System.out.printf("The engine of the %s %s has stopped.",brand,model);
    }

    public static void main(String[] args) {
        Car toyota  = new Car("Toyota","MSX",2022);
        toyota.start_engine();
        toyota.stop_engine();

    }
}
