package pl.gornik.dish;

public class DishVegetarian extends Dish {
    public DishVegetarian(String name, double price, String ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void prepare() {
        System.out.println("Danie wegetarianskie jest przygotowywane...");
    }

    @Override
    public void giveDish() {
        System.out.println("Danie wegetariańskie jest podawane do stołu:");
    }
}
