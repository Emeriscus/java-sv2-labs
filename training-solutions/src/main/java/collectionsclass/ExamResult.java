package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult> {

    private String name;
    private int score;

    public ExamResult(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return score == that.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public int compareTo(ExamResult o) {
        return score - o.getScore();
    }
}
