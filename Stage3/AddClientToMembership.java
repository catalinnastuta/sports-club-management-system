import java.util.List;
import java.util.Scanner;

public class AddClientToMembership {
    public static void addClientToMembership(Scanner scanner, ClientFile clientFile, MembershipFile membershipFile) {
        // Get client details
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();

        // Find client by name
        Client client = clientFile.getClientByName(clientName);
        if (client != null) {
            // Display available memberships
            System.out.println("Available Memberships:");
            List<Membership> memberships = membershipFile.getAllMemberships();
            for (int i = 0; i < memberships.size(); i++) {
                System.out.println((i + 1) + ". " + memberships.get(i).getName());
            }

            // Select a membership
            System.out.print("Choose a membership to add the client to: ");
            int membershipChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (membershipChoice > 0 && membershipChoice <= memberships.size()) {
                Membership selectedMembership = memberships.get(membershipChoice - 1);

                // Set membership for the client
                client.setMembership(selectedMembership);
                System.out.println("Client added to membership successfully!");
            } else {
                System.out.println("Invalid membership choice.");
            }
        } else {
            System.out.println("Client not found.");
        }
    }
}