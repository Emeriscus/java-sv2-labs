package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("The results cannot be empty");
        }
        int sumOfTopGrades = 0;
        for (int actual : results) {
            if ((double) actual / maxPoints > limitInPercent / 100.0) {
                sumOfTopGrades++;
            }
        }
        return sumOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("The results cannot be empty");
        }
        for (int actual : results) {
            if (actual / maxPoints / 1.0 <= limitInPercent / 100.0) {
                return true;
            }
        }
        return false;
    }
}
