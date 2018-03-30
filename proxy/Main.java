package proxy;

public class Main {
    
    public static void main(String[] args) {
        HDDBuffer buffer = new ProxyHDDBuffer(0);
        
        buffer.readNextSector();
        buffer.readNextSector();
        buffer.readNextSector();
        buffer.readNextSector(); 
        
        buffer.closeStream();
        
        buffer.readNextSector();
        buffer.readNextSector();
        buffer.readNextSector();
    }
}
