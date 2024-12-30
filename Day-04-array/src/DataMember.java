public class DataMember {
    public static void main(String[] args) {
        // Create an object of the House class
        House myHouse = new House();

        // Set values for the fields
        myHouse.address = "123 Main Street";
        myHouse.color = "Blue";
        myHouse.door = 3;
        myHouse.price = 250000;

        // Access and print individual fields
        System.out.println("House Address: " + myHouse.address);
        System.out.println("House Color: " + myHouse.color);

        // Call the method to display house details
        myHouse.displayHouseDetails();
        System.out.println("-".repeat(30));

        Car myCar = new Car();  // Object
        myCar.brand = "Toyota"; // Accessing fields
        myCar.speed = 120;      // Setting properties
        myCar.drive();          // Calling method
    }
}

class House {
    public String address; // This is a field (data member)
    public String color;   // This is a field (data member)
    public Integer door;   // This is a field (data member)
    public Integer price;  // This is a field (data member)

    // Method to display house details
    public void displayHouseDetails() {
        System.out.println("Address: " + address);
        System.out.println("Color: " + color);
        System.out.println("Number of Doors: " + door);
        System.out.println("Price: $" + price);
    }
}

// Java Program for class example

class Student {
    // data member (also instance variable)
    int id;
    // data member (also instance variable)
    String name;

    public static void main(String args[])
    {
        // creating an object of
        // Student
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

class Car {
    // Properties (data members/fields/variables)
    String brand;
    int speed;

    // Behavior (methods)
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}


