import java.time.LocalDateTime;
import java.util.UUID;

class Gun{
    int id;
    UUID uuid;
    String model;
    LocalDateTime releaseDate;

    void display(){
        System.out.println("Gun Id : " + id);
        System.out.println("Gun Model : " + model);
        System.out.println("Gun UUID : " + uuid);
        System.out.println("Release Date : " + releaseDate);
    }
}