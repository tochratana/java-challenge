package valadetion;

public class Car {
    private String makes;
    private String model;
    private Integer door;
    private String color;
    private boolean convertible;

    public void setMakes(String makes) {
        this.makes = makes;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMakes() {
        return makes;
    }

    public String getModel() {
        return model;
    }

    public Integer getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }
}
