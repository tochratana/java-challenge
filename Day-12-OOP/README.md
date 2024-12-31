# Exercise
### Exercise 1: E-Commerce System
1. Base Class:
   Create a class Product with attributes:
   • id (int)
   name (String)
   • price (double)
   • Add a method calculateDiscount!) that returns 0 (no discount).
   • Add a method display Retails!) to print product details.
2. Derived Classes:
   • Create a class Electronics that extends Product with an additional attribute:
   • warrantyXears (int)
   • Override calculateDiscount) to provide a 10% discount for warranties greater than 2 years.
   • Create another class Clothing with an additional attribute:
   size (String: S, M, L, XL)
   • Override calculateDiscount) to provide a 15% discount.
3. Main Program:
   • Create an array of Product references to store Electronics and Clothing objects.
   • Demonstrate polymorphism by iterating through the array and displaying details and discounts. La (Ctrl)
###  Exercise 2: Library
   Requirements:
1. Abstract Classes and Inheritance:
Create an abstract class LibraryItem with attributes:

itemId (String)

title (String)

isAvailable (boolean)


Add an abstract method borrowItem() and returnItem().

Add a concrete method displayDetails() to display the item's details.



2. Derived Classes:

Create a class Book that extends LibraryItem with attributes:

author (String)

genre (String)


Implement the borrowItem() and returnItem() methods:

Set isAvailable to false when borrowed, and true when returned.


Create another class Magazine with attributes:

issueNumber (int)

publicationDate (String)


Implement the borrowItem() and returnItem() methods with the same logic.



3. Interfaces:

Create an interface Reservable with methods:

reserveItem()

cancelReservation()


Implement Reservable in Book.



4. Advanced Behavior with Polymorphism:

Store different types of LibraryItem (e.g., books and magazines) in a list and perform operations like borrowing, returning, and reserving items.



5. Main Program:

Add a method to search for a LibraryItem by title or ID.

Allow users to perform operations (borrow, return, reserve) based on the type of item.