package products;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ball {
    public Long id;
    public UUID uuid;
    public String ballType;
    public LocalDateTime publishDate;
    public Double price;
    public Double discountAmount;

    @Override
    public String toString() {
        return "Ball{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", ballType='" + ballType + '\'' +
                ", publishDate=" + publishDate +
                ", price=" + price +
                ", discountAmount=" + discountAmount +
                '}';
    }

    // Constructor
    public Ball(Long id, UUID uuid, String ballType, LocalDateTime publishDate, Double price, Double discountAmount){
        this.id = id;
        this.uuid = uuid;
        this.ballType =ballType;
        this.publishDate = publishDate;
        this.price = price;
        this.discountAmount = discountAmount;
    }

    public Ball() {}
}
