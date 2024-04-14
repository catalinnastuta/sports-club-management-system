// Class to remove a staff member
import java.util.Scanner;

class RemoveStaff {
    public static void removeStaff(Scanner scanner, StaffFile staffFile) {
        System.out.print("Enter staff ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        staffFile.removeStaffById(id);
        System.out.println("Staff removed successfully!");
    }
}