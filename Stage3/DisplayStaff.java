// Class to display staff information
import java.util.List;

class DisplayStaff {
    public static void displayAllStaff(StaffFile staffFile) {
        List<Staff> allStaff = staffFile.getAllStaff();
        if (allStaff.isEmpty()) {
            System.out.println("---------------------------");
            System.out.println("No staff available.");
            System.out.println("---------------------------");
        } else {
            System.out.println("List of Staff Members:");
            for (Staff staff : allStaff) {
                staff.displayStaffInformation();
                System.out.println("---------------------------");
            }
        }
    }
}
