package food_delivery_app.modal;

abstract public class MenuItem {
    protected String name;
    public float price;
    protected String description;

    public MenuItem(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public abstract void getDetails();
}
