package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        try {
            int sum = 0;
            for (int actual : numbers) {
                sum += actual;
            }
            return sum;
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("The numbers cannot be null!", npe);
        }
    }

    public int getSum(String[] numbers) {
        try {
            int sum = 0;
            for (String actual : numbers) {
                sum += Integer.parseInt(actual);
            }
            return sum;
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("The numbers cannot be null!", npe);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("The numbers can only contain numbers", nfe);
        }
    }
}
