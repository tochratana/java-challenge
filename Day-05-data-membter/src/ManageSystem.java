import java.util.Scanner;

class Book {
    // Data members
    String title;         // Instance variable
    String author;        // Instance variable
    boolean isBorrowed;   // Instance variable
    static int totalBooks; // Static variable

    // Constructor (Parameterized)
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Default value
        totalBooks++;            // Increment totalBooks when a new book is created
    }

    // Constructor have : // spacial method in class
    // - the same name as the class
    // - don't have return type, event void
    // - We can create multiple constructor in the same class
    // - Call automatically when we create an Object
    // Example :
            //    class Person {
            //        // Constructor
            //        Person() {
            //            System.out.println("The constructor is called automatically!");
            //        }
            //    }
            //
            //    public class Main {
            //        public static void main(String[] args) {
            //            // Creating an object of the Person class
            //            Person person = new Person(); // Constructor is called here!
            //        }
            //    }




    // Method to borrow a book

    // Method to return a book
    // Method to borrow a book
    void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("'" + title + "' has been borrowed.");
        } else {
            System.out.println("'" + title + "' is already borrowed.");
        }
    }


    // Method to display book information
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
        System.out.println();
    }

    // Static method to get total books
    static void getTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }

    // Method to return a book
    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("'" + title + "' has been returned.");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }

}

public class ManageSystem {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        Book book3 = new Book("Think and Grow Rich", "Napoleon Hill");

        // Display information of all books
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Borrow and return a book
        book1.borrowBook(); // Borrow "Harry Potter"
        book1.borrowBook(); // Try to borrow it again
        book1.returnBook(); // Return "Harry Potter"
        book1.returnBook(); // Try to return it again

        // Display total number of books
        Book.getTotalBooks();
    }
}
