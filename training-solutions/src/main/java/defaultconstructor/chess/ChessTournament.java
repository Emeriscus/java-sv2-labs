package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {

    private List<Team> teams = new ArrayList<>();

    public ChessTournament() {
        teams.add(new Team());
        teams.add(new Team());
        teams.add(new Team());
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {

        for (int i = 0; i < teams.size(); i++) {
            if (i * 2 < playersRegistrated.size()) {
                teams.get(i).setPlayerOne(playersRegistrated.get(i * 2));
            } else {
                teams.get(i).setPlayerOne(null);
            }
            if (i * 2 + 1 < playersRegistrated.size()) {
                teams.get(i).setPlayerTwo(playersRegistrated.get(i * 2 + 1));
            } else {
                teams.get(i).setPlayerTwo(null);
            }
        }
    }
}
