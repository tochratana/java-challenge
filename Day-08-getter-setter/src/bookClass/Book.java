package bookClass;

public class Book {
    String title;
    String author;
    int publicationYear;
    float price;


    String getBookInfo(){
        return String.format("%s %s published in %d, costs $%f Is it expensive ?" ,title,author,publicationYear,
                price);
    }

    boolean isExpensive(double price){
        if (price >= 50){
            return true;
        }
        return false;
    }

    Book(String title, String author, int publicationYear, float price){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    };

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby","F. Scott Fitzgerald",1925, 20.99F);
        System.out.println(book1.getBookInfo() + book1.isExpensive(20.00));


        Book book2 = new Book("Java Programming","John Deo",2021,65.50F);
        System.out.println(book2.getBookInfo() + book2.isExpensive(65.50));
    }




}
