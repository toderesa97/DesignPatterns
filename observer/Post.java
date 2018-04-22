package observer;

import java.util.Objects;

class Post {
    
    private User author;
    private String date;
    private String message;
    private String subject;

    public Post(User author, String date, String message, String subject) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.subject = subject;
    }
    
    public String getSubject () {
        return subject;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.message, other.message);
    }
    
}
