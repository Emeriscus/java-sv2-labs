package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }

    public void addGame(GameResult result) {
        TeamStatistics home = getTeambyName(result.teamHome);
        TeamStatistics guest = getTeambyName(result.teamGuest);
        home.played(result.goalHome, result.goalGuest);
        guest.played(result.goalGuest, result.goalHome);
    }

    public TeamStatistics getTeambyName(String name) {
        TeamStatistics teamStatistics = new TeamStatistics(name);
        int index = leagueTable.indexOf(teamStatistics);
        if (index == -1) {
            leagueTable.add(teamStatistics);
            return teamStatistics;
        }
        return leagueTable.get(index);
    }

    public static class GameResult {

        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}
