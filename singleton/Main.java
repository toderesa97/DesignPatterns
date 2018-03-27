package singleton;
public class Main {
    
    public static void main (String[] args) {
        
        StringHTML messg = (StringHTML) PrinteableFactory.getPrinteable("StringHTML");
        messg.loadHTML("<h1> Hi! This is a HTML header </h1>");
        
        //PrintSpooler ps = new PrintSpooler(); // ERROR since constructor is private !
        
        // instead,
        PrintSpooler ps = PrintSpooler.getInstance();
        ps.enQueue(messg);
    }
    
}