package proxy;

public interface HDDBuffer {
        
    public byte[] readNextSector();
    public void closeStream();
    
}
