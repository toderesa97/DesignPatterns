package abstractFactory;

public class ShapeFactory extends AbstractFactory {
	
    //use getShape method to get object of type shape 
    // This class is in charge of creating particular instances of shape. Note the loose coupling
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }		
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        
        return null;
    }
    
    @Override
    Color getColor(String color) {
        return null;
    } 
}