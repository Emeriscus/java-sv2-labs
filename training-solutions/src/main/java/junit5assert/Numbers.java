package junit5assert;

import java.util.Arrays;

public class Numbers {

    public int[] getEvenNumbers(int[] numbers) {

        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
        }
        return numbers;
    }

//    public static void main(String[] args) {
//
//
//        Numbers nums = new Numbers();
//        int numsInput[] = {2, 8, 5, 6, 2, 3, 9};
//
//        int numsOutput[] = {2, 8, 0, 6, 2, 0, 0};
//
//        System.out.println(Arrays.toString(nums.getEvenNumbers(numsInput)));
//
//
//    }

}
