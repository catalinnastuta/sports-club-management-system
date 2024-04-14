// Class to add a new staff member
import java.util.Scanner;

class AddStaff {
    public static void addNewStaff(Scanner scanner, StaffFile staffFile) {
        System.out.print("Enter staff name: ");
        String name = scanner.nextLine();
        System.out.print("Enter staff ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter staff position: ");
        String position = scanner.nextLine();

        Staff newStaff = new Staff(name, id, position);
        staffFile.addStaff(newStaff);
        System.out.println("New staff added successfully!");
    }
}