import java.util.Scanner;

public class EditClientInformation {
    public static void editClientInformation(Scanner scanner, ClientFile clientFile, MembershipFile membershipFile) {
        System.out.print("Enter client name to edit: ");
        String clientName = scanner.nextLine();
        
        Client client = clientFile.getClientByName(clientName);
        if (client != null) {
            System.out.println("Editing client: " + clientName);
            System.out.print("New email (leave blank to keep current): ");
            String newEmail = scanner.nextLine();
            System.out.print("New phone (leave blank to keep current): ");
            String newPhone = scanner.nextLine();
            System.out.print("New membership (leave blank to keep current): ");
            String newMembershipName = scanner.nextLine();

            if (!newEmail.isEmpty()) {
                client.setEmail(newEmail);
            }
            if (!newPhone.isEmpty()) {
                client.setPhone(newPhone);
            }
            if (!newMembershipName.isEmpty()) {
                Membership newMembership = membershipFile.getMembershipByName(newMembershipName);
                if (newMembership != null) {
                    client.setMembership(newMembership);
                    System.out.println("Client membership updated successfully.");
                } else {
                    System.out.println("Membership not found.");
                }
            }
        } else {
            System.out.println("Client not found.");
        }
    }
}