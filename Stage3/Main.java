import java.util.Scanner;

public class Main {
    private static ClientFile clientFile;
    private static MembershipFile membershipFile;
    private static CompetitionFile competitionFile;
    private static StaffFile staffFile;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clientFile = new ClientFile();
        membershipFile = new MembershipFile();
        competitionFile = new CompetitionFile();
        staffFile = new StaffFile();

         //Premade Clients
         Client johnDoe = new Client("John Doe", "john@example.com", "1234567890");
         Client janeSmith = new Client("Jane Smith", "jane@example.com", "0987654321");
         Client aliceJohnson = new Client("Alice Johnson", "alice@example.com", "4567890123");
         //Allows for memberships to be added to premade clients
         Membership basicMembership = membershipFile.getMembershipByName("Basic");
         Membership premiumMembership = membershipFile.getMembershipByName("Premium");
         //Adds the membership to specific clients
         johnDoe.setMembership(basicMembership);
         janeSmith.setMembership(premiumMembership);
         //Adds premade clients
         clientFile.addClient(johnDoe);
         clientFile.addClient(janeSmith);
         clientFile.addClient(aliceJohnson);
         
         //Premade Staff
         Staff jakeFarmer = new Staff("Jake Farmer", 123456, "Gym Manager");
         Staff austinGomez = new Staff("Austin Gomez", 654321, "Associate Manager");
         Staff hankHill = new Staff("Hank Hill", 654123, "Trainer");
         //Adds premade staff
         staffFile.addStaff(hankHill);
         staffFile.addStaff(austinGomez);
         staffFile.addStaff(jakeFarmer);

        // Main menu options
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Client");
            System.out.println("2. Membership");
            System.out.println("3. Competition");
            System.out.println("4. Staff"); 
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    clientMenu(scanner);
                    break;
                case 2:
                    membershipMenu(scanner, clientFile, membershipFile);
                    break;
                case 3:
                    competitionMenu(scanner, competitionFile);
                    break;
                case 4:
                    staffMenu(scanner); 
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Client menu options
    private static void clientMenu(Scanner scanner) {
        while (true) {
            System.out.println("Client Menu");
            System.out.println("1. Add new client");
            System.out.println("2. Remove client");
            System.out.println("3. Edit client information");
            System.out.println("4. Display client information");
            System.out.println("5. Display all client information");
            System.out.println("6. Back to main menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    AddNewClient.addNewClient(scanner, clientFile);
                    break;
                case 2:
                    RemoveClient.removeClient(scanner, clientFile);
                    break;
                case 3:
                    EditClientInformation.editClientInformation(scanner, clientFile, membershipFile);
                    break;
                case 4:
                    DisplayClientInformation.displayClientInformation(scanner, clientFile);
                    break;
                case 5:
                    clientFile.displayAllClients();
                case 6:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Membership menu options
    private static void membershipMenu(Scanner scanner, ClientFile clientFile, MembershipFile membershipFile) {
        while (true) {
            System.out.println("Membership Menu");
            System.out.println("1. Add client to membership");
            System.out.println("2. Remove client from membership");
            System.out.println("3. Show tiers of memberships along with description of each tier");
            System.out.println("4. Back to main menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    AddClientToMembership.addClientToMembership(scanner, clientFile, membershipFile);
                    break;
                case 2:
                    RemoveClientFromMembership.removeClientFromMembership(scanner, clientFile);
                    break;
                case 3:
                    ShowMembershipTiers.showMembershipTiers(membershipFile);
                    break;
                case 4:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Competition menu options
    private static void competitionMenu(Scanner scanner, CompetitionFile competitionFile) {
        while (true) {
            System.out.println("Competition Menu");
            System.out.println("1. Competition information");
            System.out.println("2. Add competition");
            System.out.println("3. Remove competition");
            System.out.println("4. Edit competition");
            System.out.println("5. Back to main menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    ShowCompetitionInformation.showCompetitionInformation((competitionFile));
                    break;
                case 2:
                    AddCompetition.addCompetition(scanner, competitionFile);
                    break;
                case 3:
                    RemoveCompetition.removeCompetition(scanner, competitionFile);
                    break;
                case 4:
                    EditCompetition.editCompetition(scanner, competitionFile);
                    break;
                case 5:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Staff menu options
    private static void staffMenu(Scanner scanner) {
        while (true) {
            System.out.println("Staff Menu");
            System.out.println("1. Add new staff");
            System.out.println("2. Remove staff");
            System.out.println("3. Edit staff information");
            System.out.println("4. Display staff information");
            System.out.println("5. Back to main menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    AddStaff.addNewStaff(scanner, staffFile);
                    break;
                case 2:
                    RemoveStaff.removeStaff(scanner, staffFile);
                    break;
                case 3:
                    EditStaff.editStaffInformation(scanner, staffFile);
                    break;
                case 4:
                    DisplayStaff.displayAllStaff(staffFile);
                    break;
                case 5:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

