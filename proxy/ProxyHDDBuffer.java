package proxy;

public class ProxyHDDBuffer implements HDDBuffer {
    /**
     * ProxyHDDBuffer does not only behaves as a HDDBuffer BUT HAS a RealHDDBuffer. This class also provides
     *  a security control, since we are acting by proxy.
     */
    private RealHDDBuffer realHDDBuffer;
    private final int STARTBYTE;
    
    public ProxyHDDBuffer(int startByte) {
        this.STARTBYTE = startByte;
    }

    @Override
    public byte[] readNextSector() {
        if (realHDDBuffer == null) {
            realHDDBuffer = new RealHDDBuffer(STARTBYTE);
        }
        return realHDDBuffer.readNextSector();
    }
    
    @Override
    public void closeStream() {
        if (realHDDBuffer != null) {
            realHDDBuffer.closeStream();
            realHDDBuffer = null;
        }
    }
    
    
}
