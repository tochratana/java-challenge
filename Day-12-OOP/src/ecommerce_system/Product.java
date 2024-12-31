package ecommerce_system;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
class Product {
    int id;
    String name;
    double price;

    Double calculateDiscount(Double discount) {
        return price - (discount/100.0 * price);
//        return discount = 0D;
    }

    void display() {
        System.out.println("Your product id : " + id);
        System.out.println("Your product name : " + name);
        System.out.println("Your product price : $" + calculateDiscount(price));
    }

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
class ElectronicProduct extends Product {
    int warrantyYears;

    ElectronicProduct(String name, int id, double price, int warrantyYears) {
        super(name, id, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    Double calculateDiscount(Double discount) {
        return super.calculateDiscount(10D);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Your product warranty years : " + warrantyYears);
    }
}

class ClothingProduct extends Product {
    private String size;

   ClothingProduct(String name, int id, double price, String size) {
       super(name, id, price);
       this.size = size;
   }

    @Override
    Double calculateDiscount(Double discount) {
        return super.calculateDiscount(15D);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Your product size : " + size);
    }

}