package builder;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 2.25f;
    }

    @Override
    public String name() {
        return "Coke";
    }
    
}
