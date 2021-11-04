import java.util.Arrays;
import java.util.List;

public class Proba {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("kaka", "pisi", "hányás");

        System.out.println(words);            // működik, eredmény:      [kaka, pisi, hányás]
        System.out.println(words.toString()); // működik, eredmény:      [kaka, pisi, hányás]
        for (String word: words){
            System.out.println(word);
        }				   // működik, eredmény: kakapisihányás



        int[] nums = {1, 2, 3, 1, 5};
        System.out.println();
        System.out.println(nums);                   //nem működik, eredmény:   [I@1b28cdfa
        System.out.println(nums.toString());        //nem működik, eredmény:   [I@1b28cdfa
        System.out.println(Arrays.toString(nums));  //működik, eredmény:      [1, 2, 3, 1, 5]

        for (int number: nums){
            System.out.print(number);
        }


        int[][] numsXNums= {{1}, {1, 2}, {1, 2, 3}};

        System.out.println(Arrays.toString(numsXNums));  // nem működik, eredmény:  [[I@eed1f14, [I@7229724f, [I@4c873330]
        System.out.println(Arrays.deepToString(numsXNums)); // működik, eredmény:   [[1], [1, 2], [1, 2, 3]]

        System.out.println();
        for (int[] number: numsXNums) {
            System.out.print(number);
        }
        System.out.println();
        for (int[] number: numsXNums) {
            System.out.print(number.toString());
        }
        System.out.println();
        for (int[] number: numsXNums) {
            System.out.print(Arrays.toString(number));
        }

    }
}


