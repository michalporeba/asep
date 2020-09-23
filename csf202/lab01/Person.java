public class Person {
    private String name;
    protected Location location;

    public Person(String name) {
        this.name = name;
        this.location = new Location();
        System.out.println("Constructing a Person with name " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return name + " is a person who lives in " + location.toString();
    }
}
