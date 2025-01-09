package libraries;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");

        Library library = new Library();

        System.out.println("\n[+] Adding Books");
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "KOKO Cher Pheng", "Kim Chansopheng"));

        System.out.println("\n[+] Adding Members");
        library.registerMember(new Member(1, "Alice"));
        library.registerMember(new Member(2, "Bob"));
        // Book before borrow
        System.out.println("\n" +"=".repeat(10) +" Displaying All Books "+"=".repeat(10));
        library.displayBooks();

        System.out.println("\n" +"=".repeat(10) +" Displaying All Members "+"=".repeat(10));
        library.displayMembers();

        Member bob = library.findMemberById(2);
        Book greatGatsby = library.findBookById(1);
        if (bob != null && greatGatsby != null) {
            bob.borrowBook(greatGatsby);
        }
//
//        Member bob = library.findMemberById(2);
//        Book greatGatsby = library.findBookById(1);
//        if (bob != null && greatGatsby != null) {
//            bob.borrowBook(greatGatsby);
//        }

        System.out.println("\n" +"=".repeat(10) +" Displaying All Books "+"=".repeat(10));
        library.displayBooks();

        System.out.println("\n" +"=".repeat(10) +" Displaying All Members "+"=".repeat(10));
        library.displayMembers();

        if (bob != null && greatGatsby != null) {
            bob.returnBook(greatGatsby);
        }

        System.out.println("\n" +"=".repeat(10) +" Displaying All Books "+"=".repeat(10));
        library.displayBooks();

        System.out.println("\n" +"=".repeat(10) +" Displaying All Members "+"=".repeat(10));
        library.displayMembers();
    }
}

