public class Location {
    private String building;
    private String room;

    public Location() {
        building = "nowhere";
        room = "somewhere";
    }

    public Location(String building, String room) {
        this.building = building;
        this.room = room;
    }
   
    @Override
    public String toString() {
        return "a " + room + " in a " + building;
    }
}
