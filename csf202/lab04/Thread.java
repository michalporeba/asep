import java.util.*;

public class Thread {
    private final String title;
    private Category currentCategory;
    private final List<Post> posts = new ArrayList<Post>();

    // This constructor is package scoped in order to prevent
    // incorrect instantiation without association with a forum
    // A forum is effectively a factory of threads. 
    Thread(Category category, String title) {
        this.title = title;
    }

    public void changeCategory(Category category) {
        currentCategory = category;
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
