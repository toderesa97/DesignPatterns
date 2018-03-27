package builder;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 9.25f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
    
}
