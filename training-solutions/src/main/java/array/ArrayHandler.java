package array;

public class ArrayHandler {

    int[] numbers;
    String[] strings;

    void addIndexToNumber(int[] source) {
        numbers = source;
        for (int i = 0; i< source.length; i++) {
            numbers[i] = source[i] + i;
        }
    }

    void concatenateIndexToWord(String[] source) {
        strings = source;
        for (int i = 0; i < source.length; i++) {
            strings[i] = i + source[i];
        }

    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 10};
        String[] strings = {"alma", "bútor", "gyermek", "étel"};

        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(numbers);
        for (int nums : numbers) {
            System.out.println(nums);
        }
        System.out.println();
        for (int nums : numbers) {
            System.out.print(nums + ", ");
        }

        System.out.println();
        System.out.println();

        arrayHandler.concatenateIndexToWord(strings);
        for (String strs : strings) {
            System.out.println(strs);
        }
        System.out.println();
        for (String strs : strings) {
            System.out.print(strs + ", ");
        }
        System.out.println();

    }

}
