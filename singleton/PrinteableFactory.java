package singleton;

public class PrinteableFactory {
    
    public static Printeable getPrinteable(String type) {
        
        if (type == null) {
            return null;
        }
        
        if (type.equalsIgnoreCase("StringHTML")) {
            return new StringHTML();
        }
        return null;
    }
    
    
}