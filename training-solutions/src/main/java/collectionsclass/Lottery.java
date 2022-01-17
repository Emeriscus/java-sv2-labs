package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {

        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= ballCount; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        List<Integer> winningnumbers = numbers.subList(0, lotteryType);
        Collections.sort(winningnumbers);
        return winningnumbers;
    }
}
