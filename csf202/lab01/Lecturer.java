public class Lecturer extends Person {
    private int staffId;

    public Lecturer(int staffId, String name) {
        super(name);
        this.staffId = staffId;  
        System.out.println("Constructing a Lecturer with name " + name + " and staff ID " + staffId);
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
 
    @Override
    public String toString() {
        return super.getName() + " is a lecturer who teaches in " + super.getLocation().toString();
    }
}
