package pl.gornik;

import pl.gornik.dish.Dish;
import pl.gornik.dish.DishMeat;
import pl.gornik.dish.DishVegetarian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dish> dishes = new ArrayList<>();
        initialize(dishes);
        for(Dish dish1 : dishes) dish1.displayInformation();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Podaj ktore danie chcesz zmówić");
        int order1 = scanner.nextInt();
        Dish dish = dishes.get(order1);
        scanner.nextLine();
        System.out.println("Czy chcesz zmienić składniki dania? Wpisz [t] jeżeli tak i [n] nie");
        String userChoice = scanner.nextLine();
        if(userChoice.equalsIgnoreCase("t")){
            System.out.println("Podaj nowe składniki");
            String newIngrediants = scanner.nextLine();
            dish.changeIngredients(newIngrediants);
            dish.prepare();
            dish.giveDish();
            dish.displayInformation();
        }
        else{
            dish.prepare();
            dish.giveDish();
        }
    }

    private static void initialize(List<Dish> dishes){
        dishes.add(new DishMeat("Kotlet schabowy", 34.99,"Ziemniaki, surówka", "wieprzowina"));
        dishes.add(new DishMeat("Kaczka nadziana żurawiną", 70.99,"Ziemniaki, żurawina, posypka", "drób"));
        dishes.add(new DishVegetarian("Trufle w sosie z selera", 39.99,"Trufle, seler, posypka"));
        dishes.add(new DishVegetarian("Ryż z warzywami", 15.99,"Ryż, seler, sałata, pomidor, marchewka, ogórek, groszek"));
    }
}
