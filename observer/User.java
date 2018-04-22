package observer;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    
    private String name;
    private String username;

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void update(Observable observable, Object object) {
        Post post = (Post) object;
        if (((Post)object).getAuthor().equals(this)) {
            System.out.println("Hi "+name+",\n You have commented on thread "+post.getSubject()+"\nSincerely,\nOur team.");
        } else {
            System.out.println("Hi "+name+",\n User "+post.getAuthor()+
                " has commented on thread "+post.getSubject()+"\nSincerely,\nOur team.");
        }
    }

    @Override
    public String toString() {
        return name+" ("+username+")";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof User) {
            User other = (User) o;
            return username.equals(other.getUsername());
        }
        return false;
    }
    
}
