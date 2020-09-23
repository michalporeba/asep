public class Lab01 {
    public static void main(String args[]) {
        Person person = new Person("Michal");
        Person lecturer = new Lecturer(123, "Tom");
        lecturer.setLocation(new Location("fancy building", "little room"));
        
        System.out.println(person);
        System.out.println(lecturer);
    }
}