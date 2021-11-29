package recursion;

public class Numbers {

    public int getSum(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            if (i > 0) {
                return numbers[i] + getSum(numbers);

            } else {
                return numbers[0];

            }
        return numbers[0];
    }

}
