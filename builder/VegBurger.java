package builder;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 7.5f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
    
}
