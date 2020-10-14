import java.util.*;

public class Category {
   private final String name;
   private boolean isRestricted;
   private List<User> users = new ArrayList<User>();
   
   public Category(String name, boolean isRestricted) {
       this.name = name;
       this.isRestricted = isRestricted;
   }

   public void addUser(User user) {
        users.add(user);
        user.addCategory(this);
   }
}
