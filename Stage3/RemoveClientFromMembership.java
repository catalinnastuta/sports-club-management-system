import java.util.Scanner;

public class RemoveClientFromMembership {
    public static void removeClientFromMembership(Scanner scanner, ClientFile clientFile) {
        // Get client details
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();

        // Find client by name
        Client client = clientFile.getClientByName(clientName);
        if (client != null) {
            // Check if client has a membership
            if (client.getMembership() != null) {
                // Display client's membership
                System.out.println("Client's Membership: " + client.getMembership().getName());

                // Ask for confirmation to remove membership
                System.out.print("Are you sure you want to remove this client's membership? (yes/no): ");
                String confirmation = scanner.nextLine();

                if (confirmation.equalsIgnoreCase("yes")) {
                    // Remove membership
                    client.setMembership(null);
                    System.out.println("Client's membership removed successfully!");
                } else {
                    System.out.println("Membership removal cancelled.");
                }
            } else {
                System.out.println("This client does not have a membership.");
            }
        } else {
            System.out.println("Client not found.");
        }
    }
}