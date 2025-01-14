package food_delivery_app.modal;

import java.util.List;

public class FoodItem extends MenuItem {
    private List<String> ingredients;

    public FoodItem(String name, float price, String description, List<String> ingredients) {
        super(name, price, description);
        this.ingredients = ingredients;
    }

    @Override
    public void getDetails() {
        System.out.println("Food Item: " + name + "\nPrice: $" + price + "\nDescription: " + description);
        System.out.println("Ingredients: " + String.join(", ", ingredients));
    }
}
