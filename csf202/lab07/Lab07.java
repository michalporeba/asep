public class Lab07 {
    public static void main(String args[]) {
        Settings s1 = Settings.getInstance();
        Settings s2 = Settings.getInstance();

        s1.setName("FirstName");
        System.out.println("s1 name is: " + s1.getName());
        System.out.println("s2 name is: " + s2.getName());

        s2.setName("SecondName");
        System.out.println("s1 name is: " + s1.getName());
        System.out.println("s2 name is: " + s2.getName());
    }
}
