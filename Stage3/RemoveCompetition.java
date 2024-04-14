import java.util.Scanner;

public class RemoveCompetition {
    public static void removeCompetition(Scanner scanner, CompetitionFile competitionFile) {
        System.out.print("Enter the name of the competition to remove: ");
        String name = scanner.nextLine();
        Competition competitionToRemove = null;
        for (Competition competition : competitionFile.getCompetitions()) {
            if (competition.getName().equalsIgnoreCase(name)) {
                competitionToRemove = competition;
                break;
            }
        }
        if (competitionToRemove != null) {
            competitionFile.removeCompetition(competitionToRemove);
            System.out.println("Competition removed successfully!");
        } else {
            System.out.println("Competition not found.");
        }
    }
}
