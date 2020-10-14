import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Forum {
    private String name;
    private boolean loginRequired;
    private final List<User> users = new ArrayList<User>();
    private final List<Thread> threads = new ArrayList<Thread>();

    public void registerUser(String username, String password)
    {

    }

    public void removeUser(User user) 
    {
        users.remove(user);
    }

    public void createNewThread(String title, Post initialPost)
    {
        // this will throw. there is incosistency in the design. 
        // Forum creates a Thread instance, but without passing Category
        // which the Thread needs. 
        Thread thread = new Thread(null, title);
        thread.addPost(initialPost);
        threads.add(thread);
    }

    public void show(Thread thread)
    {

    }
}