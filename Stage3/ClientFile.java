import java.util.ArrayList;
import java.util.List;

public class ClientFile {
    private List<Client> clients;

    public ClientFile() {
        clients = new ArrayList<>();
    }

    public void displayAllClients() {
        System.out.println("All Clients:");
        for (Client client : clients) {
            System.out.println("Name: " + client.getName());
            System.out.println("Email: " + client.getEmail());
            System.out.println("Phone: " + client.getPhone());
            System.out.println("Membership: " + client.getMembershipString());
            System.out.println("---------------------------");
        }
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public boolean removeClient(String clientName) {
        for (Client client : clients) {
            if (client.getName().equals(clientName)) {
                clients.remove(client);
                return true;
            }
        }
        return false; // Client not found
    }

    public Client getClientByName(String clientName) {
        for (Client client : clients) {
            if (client.getName().equals(clientName)) {
                return client;
            }
        }
        return null; // Client not found
    }

    public List<Client> getAllClients() {
        return clients;
    }
}