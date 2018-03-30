/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author test
 */
public class WhipDecorator extends AddOnDecorator {
    
    private Beverage beverage;
    private float cost;

    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
        cost = 0.5f;
    }
    
    @Override
    public float cost() {
        return cost + beverage.cost();
    }
    
    @Override
    public String description() {
        return String.format("%s, Whip (%f)", beverage.description(), cost);
    }
    
}
