import java.util.Arrays;
import java.util.UUID;

class Book {
    String name;
    String[] author;
    UUID uuid;
    Double price;

    Book(String name, String[] author, UUID uuid,Double price){
        this.name = name;
        this.author = author;
        this.uuid = uuid;
        this.price = price;
    }

    void bookDetail () {
        System.out.println("Name : " + name);
        System.out.println("Author : " + Arrays.toString(author));
        System.out.println("UUID : " + uuid);
        System.out.printf("Price : $" + price);
    }

}

public class Bookes {
    public static void main(String[] args) {

        Book sronNgoun = new Book(
                "Toch Ratana",
                new String[]{"Dara","Miea"},
                UUID.randomUUID(),
                23.45

        );

        sronNgoun.bookDetail();
    }

}
