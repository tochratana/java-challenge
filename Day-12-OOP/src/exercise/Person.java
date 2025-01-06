package exercise;

public class Person {
    String firstName;
    String lastName;
    int age;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getAge() {
        return age;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }
        return false;
    }
}
