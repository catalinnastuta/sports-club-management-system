import java.util.Scanner;

public class AddCompetition {
    public static void addCompetition(Scanner scanner, CompetitionFile competitionFile) {
        System.out.print("Enter competition name: ");
        String name = scanner.nextLine();
        System.out.print("Enter competition description: ");
        String description = scanner.nextLine();
        Competition newCompetition = new Competition(name, description);
        competitionFile.addCompetition(newCompetition);
        System.out.println("Competition added successfully!");
    }
}
