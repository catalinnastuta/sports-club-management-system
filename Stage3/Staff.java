public class Staff extends Person {

    public Staff(String name, int id, String position) {
        super(name, id, position);
    }

    public void displayStaffInformation() {
        System.out.println("Staff Name: " + getName());
        System.out.println("Staff ID: " + getId());
        System.out.println("Position: " + getPosition());
    }
}