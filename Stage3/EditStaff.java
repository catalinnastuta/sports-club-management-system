// Class to edit staff information
import java.util.Scanner;

class EditStaff {
    public static void editStaffInformation(Scanner scanner, StaffFile staffFile) {
        System.out.print("Enter staff ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Staff staffToEdit = staffFile.findStaffById(id);
        if (staffToEdit != null) {
            System.out.print("Enter new staff name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new staff position: ");
            String newPosition = scanner.nextLine();

            staffToEdit.setName(newName);
            staffToEdit.setPosition(newPosition);

            System.out.println("Staff information updated successfully!");
        } else {
            System.out.println("Staff not found with ID: " + id);
        }
    }
}