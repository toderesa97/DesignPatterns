package bridge;

public class Main {
    /**
                          ----Shape---
                         /            \
                Rectangle              Circle
               /         \            /      \
       BlueRectangle  RedRectangle BlueCircle RedCircle
     *  
     *
     * 
     * CONVERTED TO ....
     * 
                 ----Shape---                        Color
                /            \                       /   \
       Rectangle(Color)   Circle(Color)           Blue   Red
     * 
     * The Bridge pattern is designed to separate a class's interface from its implementation 
     * so you can vary or replace the implementation without changing the client code.
     */
    
    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedCircle());
        redCircle.draw();
    }
    
}
