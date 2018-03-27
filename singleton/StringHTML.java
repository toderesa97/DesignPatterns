package singleton;

public class StringHTML implements Printeable {
    
    private String html;
    
    public StringHTML() {
    }
    
    public void loadHTML(String html) {
        this.html = html;
    }
    
    @Override
    public String toString() {
        return html;
    }
    
}