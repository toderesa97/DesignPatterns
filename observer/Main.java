package observer;

public class Main {

    public static void main(String[] args) {
        User bob = new User("Bob", "Bob145");
        User mary = new User("Mary", "Mary.willians");
        User oscar = new User("Oscar", "Oscar.w874");
        
        Forum forum = new Forum();
        Thread thread1 = new Thread("15/02/2018", "Presentation next week");
        
        thread1.addPost(bob, "Hi everyone!");
        thread1.addPost(mary, "Hi Bob");
        thread1.addPost(oscar, "Hi Bob and mary");
        
        
        System.out.println(" -------------------------------------- ");
        Thread thread2 = new Thread("16/03/2018", "How can I split an array in Java?");
        thread2.addPost(oscar, "Hi, I have been struggling to ... ");
        thread2.addPost(mary, "just execute arr.split([regex])");
        
    }

}
