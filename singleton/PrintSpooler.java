package singleton;

public class PrintSpooler {
    
    private PrintSpooler() {
        
    }
    
    private static PrintSpooler instance;
    
    public static PrintSpooler getInstance () {
        if (instance == null) {
            instance = new PrintSpooler();    
        } 
        return instance;
    }
    
    public void enQueue(Printeable object) {
        // whatever
        System.out.print("Printing -> "+object);
    }
    
    public void deQueue() {
        // whatever
    }
    
}