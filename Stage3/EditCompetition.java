import java.util.Scanner;

public class EditCompetition {
    public static void editCompetition(Scanner scanner, CompetitionFile competitionFile) {
        System.out.print("Enter the name of the competition to edit: ");
        String name = scanner.nextLine();
        Competition competitionToEdit = null;
        for (Competition competition : competitionFile.getCompetitions()) {
            if (competition.getName().equalsIgnoreCase(name)) {
                competitionToEdit = competition;
                break;
            }
        }
        if (competitionToEdit != null) {
            System.out.print("Enter new name for the competition: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new description for the competition: ");
            String newDescription = scanner.nextLine();
            Competition newCompetition = new Competition(newName, newDescription);
            competitionFile.editCompetition(competitionToEdit, newCompetition);
            System.out.println("Competition edited successfully!");
        } else {
            System.out.println("Competition not found.");
        }
    }
}

