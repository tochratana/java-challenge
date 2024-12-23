public class Main {
    public static void main(String[] args) {
        // Create a Person record
        Person person = new Person("Alice", 30);

        // Access fields using generated methods
        System.out.println(person.name()); // Output: Alice
        System.out.println(person.age());  // Output: 30

        // Print the record
        System.out.println(person); // Output: Person[name=Alice, age=30]

        // Compare two records
        Person anotherPerson = new Person("Alice", 30);
        System.out.println(person.equals(anotherPerson)); // Output: true
    }
}
