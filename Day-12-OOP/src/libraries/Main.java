package libraries;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");

        Library library = new Library();

        // Add new book to library with ID,TITLE,AUTHOR
        System.out.println("\n[+] Adding Books");
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "KOKO Cher Pheng", "Kim Chansopheng"));
        library.addBook(new Book(4, "1984", "George Orwell"));


        // Add Member to register with ID, NAME
        System.out.println("\n[+] Adding Members");
        library.registerMember(new Member(1, "Alice"));
        library.registerMember(new Member(2, "Bob"));
        library.registerMember(new Member(3, "Charlie"));

        // Book before borrow
        System.out.println("\n" +"=".repeat(10) +" Displaying All Books "+"=".repeat(10));
        library.displayBooks();

        // Member before borrow
        System.out.println("\n" +"=".repeat(10) +" Displaying All Members "+"=".repeat(10));
        library.displayMembers();


        // Bob borrow book on index 1
        Member bob = library.findMemberById(2);
        Book greatGatsby = library.findBookById(1);
        if (bob != null && greatGatsby != null) {
            bob.borrowBook(greatGatsby);
        }

        // Bob borrow book on index 3
        bob = library.findMemberById(2);
        Book KOKO = library.findBookById(3);
        if (bob != null && KOKO != null) {
            bob.borrowBook(KOKO);
        }

        // Display book after borrow, Book 1,3 is borrowed
        System.out.println("\n" +"=".repeat(10) +" Displaying All Books "+"=".repeat(10));
        library.displayBooks();


        // Display Member after borro, Bob borrow 2 book
        System.out.println("\n" +"=".repeat(10) +" Displaying All Members "+"=".repeat(10));
        library.displayMembers();


        // Bob give book to Library
        if (bob != null && greatGatsby != null) {
            bob.returnBook(greatGatsby);
        }
        if (bob != null && KOKO != null) {
            bob.returnBook(KOKO);
        }


        // Display book in library after all member give book to library
        System.out.println("\n" +"=".repeat(10) +" Displaying All Books "+"=".repeat(10));
        library.displayBooks();


        // Display all Member after they give book to library
        System.out.println("\n" +"=".repeat(10) +" Displaying All Members "+"=".repeat(10));
        library.displayMembers();
    }
}

