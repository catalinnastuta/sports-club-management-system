import java.util.ArrayList;
import java.util.List;

public class CompetitionFile {
    private List<Competition> competitions;

    public CompetitionFile() {
        this.competitions = new ArrayList<>();
    }

    public void addCompetition(Competition competition) {
        competitions.add(competition);
    }

    public void removeCompetition(Competition competition) {
        competitions.remove(competition);
    }

    public void editCompetition(Competition oldCompetition, Competition newCompetition) {
        int index = competitions.indexOf(oldCompetition);
        if (index != -1) {
            competitions.set(index, newCompetition);
        }
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }
}
