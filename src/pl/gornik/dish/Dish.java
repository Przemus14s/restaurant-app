package pl.gornik.dish;

public abstract class Dish {
    private final String name;
    private final double price;
    private String ingredients;

    public Dish(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public abstract void prepare();

    public abstract void giveDish();

    public void displayInformation() {
        System.out.println(name + ", cena " + price + " składniki " + ingredients);
    }

    public void changeIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}

