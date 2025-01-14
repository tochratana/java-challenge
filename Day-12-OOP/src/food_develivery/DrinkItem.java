package food_develivery;

class DrinkItem extends MenuItem {
    private String size;

    public DrinkItem(String name, float price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }

    @Override
    public String getDetails() {
        return String.format("Drink: %s\nPrice: $%.2f\nDescription: %s\nSize: %s",
                name, price, description, size);
    }
}
