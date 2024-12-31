package challenge;

public class Custormer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }


    public String getEmailAddress() {
        return emailAddress;
    }



    // with instance field
    Custormer(String name, String creditLimit, String emailAddress) {
     this.name = name;
     this.creditLimit = creditLimit;
     this.emailAddress = emailAddress;
    }

    Custormer(String name, String emailAddress){
        this(null,name,emailAddress);
    }


    // non-arguments, but it calls another constructor using this keyword
    Custormer() {
        this("Toch Ratana","A-1","ratana@gmail.com");
    }

    public static void main(String[] args) {
    }
}
