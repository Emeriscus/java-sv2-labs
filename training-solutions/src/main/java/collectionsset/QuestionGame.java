package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public List<RightAnswer> getRightAnswers() {
        return rightAnswers;
    }

    public Set<String> drawWinners() {

        Set<String> winners = new HashSet<>();
        Random rnd = new Random();

        while (winners.size() != 5 && rightAnswers.size() > 0) {
            RightAnswer winner = rightAnswers.get(rnd.nextInt(0, rightAnswers.size()));
            if (!winners.contains(winner.getName())) {
                winners.add(winner.getName());
                rightAnswers.remove(winner);
            }
        }
        if (rightAnswers.size() == 0) {
            throw new IllegalArgumentException("Not enough right answers!");
        }
        return winners;
    }


}
