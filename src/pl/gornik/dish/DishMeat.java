package pl.gornik.dish;

public class DishMeat extends Dish {
    private final String meatType;

    public DishMeat(String name, double price, String ingredients, String meatType) {
        super(name, price, ingredients);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("Danie mięsne o rodzaju mięsa " + meatType + " jest przygotowywane...");

    }

    @Override
    public void giveDish() {
        System.out.println("Danie mięsne jest podawane do stołu :");
    }
}
