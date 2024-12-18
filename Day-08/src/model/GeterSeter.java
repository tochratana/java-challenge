package model;

public class GeterSeter {
    String name;
    String email;
    Integer password;

    void getder(String email){
        this.email = email;
    }
    void setder(String email){
        this.email = email;
    }


    public static void main(String[] args) {
        GeterSeter geterSeter = new GeterSeter();

    }

}
