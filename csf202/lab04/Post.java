public class Post {
    private final String text;
    private final User author;

    Post(User author, String text) {
        if (author == null) {
            throw new IllegalArgumentException("each post needs to have an author");
        }
        if (text == null || text.length() == 0) {
            throw new IllegalArgumentException("text cannot be null or empty");
        }

        this.author = author;
        this.text = text;
    }
    
    public String quote() {
        return author + " says: " + text;
    }
}
