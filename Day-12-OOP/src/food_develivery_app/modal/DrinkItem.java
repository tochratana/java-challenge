package food_develivery_app.modal;

public class DrinkItem extends MenuItem {
    private String size;

    public DrinkItem(String name, float price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }

    @Override
    public void getDetails() {
        System.out.println("Drink Item: " + name + "\nPrice: $" + price + "\nDescription: " + description);
        System.out.println("Size: " + size);
    }
}
