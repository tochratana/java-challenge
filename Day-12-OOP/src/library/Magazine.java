package library;

class Magazine extends Library {
    int issueNumber;
    String publicationDate;

    Magazine(String itemId, String title, Boolean isAvailable, String publicationDate, int issueNumber) {
        super(itemId, title, isAvailable);
        this.publicationDate = publicationDate;
        this.issueNumber = issueNumber;
    }

    @Override
    void borrowItem(Boolean isAvailable) {
        isAvailable = false;
    }

    @Override
    void returnItem(Boolean isAvailable) {
       isAvailable = true;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Issue Number: " + issueNumber);
    }
}
