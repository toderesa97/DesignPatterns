package decorator;

public abstract class AddOnDecorator extends Beverage {
    
    protected Beverage beverage;

    @Override
    public abstract float cost();
    
}
