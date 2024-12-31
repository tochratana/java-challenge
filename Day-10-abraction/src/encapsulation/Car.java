package encapsulation;

public class Car {
    private String model;
    private Integer price;
    private String color;


    //  Getter and Setter use for control and protect fields
    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getModel () {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }


    public Car () {}

    public Car(String model, String color, Integer price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
