import java.util.Scanner;

public class AddNewClient {
    public static void addNewClient(Scanner scanner, ClientFile clientFile) {
        System.out.println("Enter client information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        Client newClient = new Client(name, email, phone); // Remove membership parameter
        clientFile.addClient(newClient);
        System.out.println("Client added successfully!");
    }
}