package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {

        int count = 0;

        for (int i = 10; i < 100; i++) {
            if (Math.abs((int) Integer.toString(i).charAt(0) - (int) Integer.toString(i).charAt(1)) == 5) {
                count++;
            }
        }
        return count;
    }
}
