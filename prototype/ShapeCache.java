package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    
    private static Map<String, Shape> shapeMap = new HashMap<>();
    
    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return cachedShape != null ? (Shape) cachedShape.clone() : null;
    }
   
    public static void loadCache() {
        // caching figures
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);
        
        Circle circle = new Circle();
        circle.setId("2");
        shapeMap.put(circle.getId(), circle);
    }
}
