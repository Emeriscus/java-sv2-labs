package algorithmsmax.trainer;

import algorithmsmax.temperature.Temperature;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {

        Trainer trainerWithMaxAge = null;
        int maxAge = trainers.get(0).getAge();
        for (Trainer actual : trainers) {
            if (actual.getAge() > maxAge) {
                maxAge = actual.getAge();
                trainerWithMaxAge = actual;
            }
        }
        return trainerWithMaxAge;
    }
}
