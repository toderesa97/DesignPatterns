package decorator;

public class CaramelDecorator extends AddOnDecorator {
    
    private float cost;
    
    public CaramelDecorator(Beverage beverage) {
        super.beverage = beverage;
        cost = 0.25f;
    }

    @Override
    public float cost() {
        return cost + beverage.cost();
    }

    @Override
    public String description() {
        return String.format("%s, Caramel (%f)", beverage.description(), cost);
    }
    
}
