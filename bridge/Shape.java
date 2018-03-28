package bridge;

public abstract class Shape {
    
    private DrawAPI drawAPI;
    
    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    
    public void draw() {
        drawAPI.drawCircle();
    }
    
}
