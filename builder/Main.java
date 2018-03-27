package builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.cost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.cost());
        
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Coke());
        list.add(new Pepsi());
        list.add(new ChickenBurger());
        list.add(new VegBurger());
        Meal custom = mealBuilder.customMenu(list);
        System.out.println("\nCustom");
        custom.showItems();
        System.out.println("\nTotal: "+custom.cost());
    }    
}
