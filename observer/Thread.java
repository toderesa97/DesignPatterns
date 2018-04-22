package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Thread extends Observable {
    
    private String creationDate;
    private String lastPostedDate;
    private String lastPostedBy;
    private List<Post> posts;
    private List<Observer> observers;
    private String name;
    
    public Thread (String creationDate, String subject) {
        this.creationDate = creationDate;
        posts = new ArrayList<>();
        this.name = subject;
        observers = new ArrayList<>();
    }
    
    public void addPost(User owner, String message) {
        Post post = new Post(owner, "15/02/2018", message, name);
        posts.add(post);
        registerObserver(owner);
        notifyObservers(this, post);
    }
    
    public void removePost(Post post) {
        posts.remove(post);
    }
    
    public void notifyObservers (Observable observable, Post post) {
        observers.forEach((observer) -> {
            observer.update(observable, post);
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Thread) {
            Thread other = (Thread) o;
            return other.posts.equals(posts);
        }
        return false;
    }
    
}
