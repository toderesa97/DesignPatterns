package prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }
    
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
    
}
