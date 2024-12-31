package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Product {

    public Integer id;
    public UUID uuid;
    public String productName;
    public Double price;
    public LocalDateTime expiredDate;


    // Constructor with parameter
    public Product(Integer id, UUID uuid, String productName , Double price , LocalDateTime expiredDate){
        // if we use id = id it mean
        //  para on top = para in constructor
        // so we use key word this
        
        this.id = id;
        this.uuid  = uuid;
        this.productName = productName;
        this.price = price;
        this.expiredDate = expiredDate;
    }

}
