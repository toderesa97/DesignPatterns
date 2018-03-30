package proxy;

public class RealHDDBuffer implements HDDBuffer {
    
    protected RealHDDBuffer(int startByte) {
        System.out.println("Creating HDDBuffer instance ... ");
    }
    
    @Override
    public byte[] readNextSector() {
        System.out.println("Reading next sector ... ");
        return new byte[] {1,0,0,0,1,1,0,0,0}; // whatever the content is
    }
    
    @Override
    public void closeStream() {
        System.out.println("Closing Stream ... ");
    }
}
