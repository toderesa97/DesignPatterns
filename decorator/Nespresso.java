package decorator;

public class Nespresso extends Beverage {

    @Override
    public float cost() {
        return 1.5f;
    }

    @Override
    public String description() {
        return "Nespresso ("+cost()+")";
    }
    
}
