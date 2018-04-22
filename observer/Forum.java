package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Forum extends Observable {
    
    private List<Thread> threads;
    
    public Forum () {
        threads = new ArrayList<>();
    }
    
    public void add(Thread thread) {
        threads.add(thread);
    }
    
    public void remove(Thread thread) {
        threads.remove(thread);
    }
    
}
