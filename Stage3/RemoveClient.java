import java.util.Scanner;

public class RemoveClient {
    public static void removeClient(Scanner scanner, ClientFile clientFile) {
        System.out.print("Enter client name to remove: ");
        String clientName = scanner.nextLine();
        
        if (clientFile.removeClient(clientName)) {
            System.out.println("Client removed successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }
}