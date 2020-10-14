import java.util.*;

public class User {
    private final String username;
    private final Date birthday;
    private final String location;
    private final String occupation;
    private final String password;
    private final List<Category> categories = new ArrayList<Category>();

    public User(String username, Date birthday, String location, String occupation, String password){
        this.username = username;
        this.birthday = birthday;
        this.location = location;
        this.occupation = occupation;
        this.password = password;
    }

    public String getDetails() {
        return username;
    }

    public Post makePost(String text) {
        return new Post(this, text);
    }

    void addCategory(Category category) {
        categories.add(category);
    }
}
