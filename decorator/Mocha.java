package decorator;

public class Mocha extends Beverage {

    @Override
    public float cost() {
        return 2.5f;
    }

    @Override
    public String description() {
        return "Mocha ("+cost()+")";
    }
    
}
