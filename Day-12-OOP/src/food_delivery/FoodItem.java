package food_delivery;

import java.util.List;

class FoodItem extends MenuItem {
    private List<String> ingredients;

    public FoodItem(String name, float price, String description, List<String> ingredients) {
        super(name, price, description);
        this.ingredients = ingredients;
    }

    @Override
    public String getDetails() {
        return String.format("Food: %s\nPrice: $%.2f\nDescription: %s\nIngredients: %s",
                name, price, description, String.join(", ", ingredients));
    }
}
