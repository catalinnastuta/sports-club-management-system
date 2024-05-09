/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stage4;

/**
 *
 * @author skeet
 */
import java.util.HashMap;
import java.io.*;
import javax.swing.JOptionPane;

public class ClientFile {
    private HashMap<String, Client> clients;
    private static final String filename = "clients.csv";
    private static final String delimiter = ",";

    public ClientFile() {
        clients = new HashMap<>();
    }

    public void addClient(Client client) {
        String name = client.getName();
        clients.put(name, client);
    }

    public void removeClient(String name) {
        clients.remove(name);
    }
    
    public Client getClients(String name){
        return clients.get(name);
    }
    
    public HashMap<String, Client> getClients() {
        return clients;
    }
}
