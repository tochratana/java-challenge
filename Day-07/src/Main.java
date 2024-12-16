// Create Object or Instance create
// CRUD operation



import model.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(3, UUID.randomUUID(),"Ratana",34.4,LocalDateTime.now() );
        product.id = new Random().nextInt(20);
        System.out.print("Input Product Name : ");
        product.productName = new Scanner(System.in).nextLine();
        System.out.print("Price : ");
        int prices = new Scanner(System.in).nextInt();
        product.price = 7d;
        System.out.println(product.price);
        System.out.println("This is a product ID : " + product.id);

    }
}
