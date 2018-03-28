package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShapeRectangle = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShapeRectangle.getType());
        
        Shape clonedShapeCircle = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShapeCircle.getType());
    }
}
