package library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class Main {
    public static void main(String[] args) {
        List<Library> libraries = new ArrayList<>();


        // Book
        Library book1 = new Book("1", "The Innovator's Dilemma", true, "Clayton Christensen", "Business");
        Library book2 = new Book("2", "Introduction to Algorithms", false, "Thomas H. Cormen", "Education");
        Library book3 = new Book("3", "Java: The Complete Reference", true, "Herbert Schildt", "Programming");
        Library book4 = new Book("4", "The Pragmatic Programmer", true, "Andy Hunt", "Technology");
        Library book5 = new Book("5", "Refactoring: Improving the Design of Existing Code", true, "Martin Fowler", "Software Engineering");

        // Magazine
        Library megazine1 = new Magazine("1", "Tech Today", true, "03-15-2025", 5);
        Library megazine2 = new Magazine("2", "Fitness World", false, "07-10-2024", 3);
        Library megazine3 = new Magazine("3", "Travel Explorer", true, "12-01-2024", 8);
        Library megazine4 = new Magazine("4", "Cooking Mastery", false, "09-22-2025", 6);
        Library megazine5 = new Magazine("5", "Art & Design", true, "05-30-2023", 4);





        // Add to a library list
        libraries.add(book1);
        libraries.add(book2);
        libraries.add(book3);
        libraries.add(book4);
        libraries.add(book5);
        libraries.add(megazine1);
        libraries.add(megazine2);
        libraries.add(megazine3);
        libraries.add(megazine4);
        libraries.add(megazine5);

        System.out.println(book1.title);

        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        String[] columNames = {"Item ID","Title","Is Available","Author/publication Date","Genre/Issue Number"};
        for( int i=0 ; i<columNames.length ; i++ ) {
            table.addCell(columNames[i], new CellStyle(CellStyle.HorizontalAlign.center));
            table.setColumnWidth(i, 20, 30);
        }

        table.addCell(libraries.getFirst().itemId, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(libraries.getFirst().title, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(libraries.getFirst().isAvailable.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(((Book) book1).author, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(((Book) book1).genre, new CellStyle(CellStyle.HorizontalAlign.center));






        System.out.println(table.render());

        libraries.getFirst().displayDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Can I help you ?(y/n): ");
        String help = scanner.nextLine();
        if (help.equalsIgnoreCase("y") || help.equalsIgnoreCase("yes")) {
            System.out.print("1. Search by Id\n2. Search by title\n");
            System.out.print("Choose one of the following:");
            int choice = scanner.nextInt();
            boolean found;

            switch (choice) {
                case 1:
                    System.out.print("Search id : ");
                    String id  = new Scanner(System.in).nextLine();

                    found = false;
                    for (Library library : libraries) {
                        if(library.itemId.equals(id)) {
                            System.out.println("This book is found in the library");
                            found = true;
                            break;

                        }
                    }

                    if(!found) {
                        System.out.println("This id book " + id + " is not found in the library");
                    }
                    break;
                case 2:
                    System.out.print("Search Title : ");
                     String title = new Scanner(System.in).nextLine();

                     found = false;
                    for (Library library : libraries) {
                        if(library.title.equals(title)) {
                            System.out.println("This book is found in the library");
                            found = true;
                            break;

                        }
                    }

                    if(!found) {
                        System.out.println("The " + title + " is not found in the library");
                    }
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }else {
            System.out.println("Thank you!");
        }


    }
}
