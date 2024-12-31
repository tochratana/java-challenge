package library;

class Book extends Library implements Reservable {
    String author;
    String genre;


    void searchItem(String itemId) {
        System.out.println("Search Book : " + itemId);
    }

    @Override
    void borrowItem(Boolean isAvailable) {
        isAvailable  = false;
    }

    @Override
    void returnItem(Boolean isAvailable) {
        isAvailable  = true;
    }

    @Override
    public void reserveItem() {
            System.out.println("Reserve Book : " + title);
    }

    @Override
    public void cancelReservation() {
        System.out.println("Cancel Book : " + title);

    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        if(isAvailable){
            reserveItem();
        }else {
            cancelReservation();
        }
    }

    Book(String itemId, String title, Boolean isAvailable, String author, String genre) {
        super(itemId, title, isAvailable);
        this.author = author;
        this.genre = genre;
    }
}

