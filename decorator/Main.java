package decorator;

public class Main {
    /**
     * Decorator pattern allows a user to add new functionality to an existing object without 
     * altering its structure. This type of design pattern comes under structural pattern as 
     * this pattern acts as a wrapper to existing class. This pattern creates a decorator class 
     * which wraps the original class and provides additional functionality keeping class methods signature intact.
     * 
     * A decorator is not only a Component BUT has a Component. In our example Beverage is a Concrete Component
     *  and Beverage is a Component
     */
    public static void main(String[] args) {
        Beverage mochaDoubleCaramel = new CaramelDecorator(new CaramelDecorator(new WhipDecorator(new Mocha())));
        
        System.out.println(mochaDoubleCaramel.description());
        System.out.println(mochaDoubleCaramel.cost());
        
    }
}