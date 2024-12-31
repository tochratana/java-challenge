package ecommerce_system;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new ElectronicProduct("Electronics",1,500,2);
        products[1] = new ClothingProduct("Clothing",2,200,"M");
        products[0].display();
        System.out.println("-".repeat(30));
        products[1].display();




    }
}
