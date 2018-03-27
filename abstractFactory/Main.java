package abstractFactory;

public class Main {

    public static void main(String[] args) {
        // let's play ...
        
        // 1  getting the factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        // 2 getting particular instances of shapes
        Shape circle1 = shapeFactory.getShape("CIRCLE");
        circle1.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        Color color1 = colorFactory.getColor("Green");
        color1.fill();
    }
}