package library;

abstract class Library {
    String itemId;
    String title;
    Boolean isAvailable;

    Library(String itemId, String title, Boolean isAvailable) {
        this.itemId = itemId;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    abstract void borrowItem(Boolean isAvailable);
    abstract void returnItem(Boolean isAvailable);

    void displayDetails() {
        System.out.println("Item: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
}






