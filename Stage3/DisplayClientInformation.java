import java.util.Scanner;

public class DisplayClientInformation {
    public static void displayClientInformation(Scanner scanner, ClientFile clientFile) {
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();
        
        Client client = clientFile.getClientByName(clientName);
        if (client != null) {
            System.out.println("Client Information:");
            System.out.println("Name: " + client.getName());
            System.out.println("Email: " + client.getEmail());
            System.out.println("Phone: " + client.getPhone());
            System.out.println("Membership: " + client.getMembershipString());
        } else {
            System.out.println("Client not found.");
        }
    }
}