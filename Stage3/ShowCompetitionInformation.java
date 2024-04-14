// Method to show competition information
import java.util.List;

public class ShowCompetitionInformation{


static void showCompetitionInformation(CompetitionFile competitionFile) {
    List<Competition> competitions = competitionFile.getCompetitions();
    if (competitions.isEmpty()) {
        System.out.println("No competitions available.");
    } else {
        System.out.println("Competitions:");
        for (Competition competition : competitions) {
            System.out.println("Name: " + competition.getName());
            System.out.println("Description: " + competition.getDescription());
            System.out.println();
        }
    }
}

}