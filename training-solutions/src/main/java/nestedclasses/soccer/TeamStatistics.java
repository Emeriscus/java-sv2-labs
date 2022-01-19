package nestedclasses.soccer;

import java.util.List;
import java.util.Objects;

public class TeamStatistics {

    private String teamName;
    private Statistic statistic;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.statistic = new Statistic();
    }

    public String getTeamName() {
        return teamName;
    }

    public class Statistic {
        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;
        private int points;
    }

    public int getPlayed() {
        return statistic.played;
    }

    public int getWon() {
        return statistic.won;
    }

    public int getTied() {
        return statistic.tied;
    }

    public int getLost() {
        return statistic.lost;
    }

    public int getGoalsFor() {
        return statistic.goalsFor;
    }

    public int getGoalsAgainst() {
        return statistic.goalsAgainst;
    }

    public int getPoints() {
        return statistic.points;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {

        if (plusGoalsFor > plusGoalsAgainst) {
            statistic.won++;
            statistic.points += 3;
        }
        if (plusGoalsFor == plusGoalsAgainst) {
            statistic.tied++;
            statistic.points += 1;
        }
        if (plusGoalsFor < plusGoalsAgainst) {
            statistic.lost++;
        }
        statistic.played++;
        statistic.goalsFor += plusGoalsFor;
        statistic.goalsAgainst += plusGoalsAgainst;
    }
}
