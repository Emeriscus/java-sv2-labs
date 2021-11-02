package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {

    public void convertInts(String ints) {

        Scanner scanner = new Scanner(ints);

        scanner.useDelimiter(";");
        List<Integer> nums = new ArrayList<>();

        while (scanner.hasNextInt()) {
            nums.add(scanner.nextInt());
        }

        StringBuilder numsOutput = new StringBuilder();

        for (int i = 0; i < nums.size(); i++) {
            if (i == 0) {
                if (nums.get(i) > 100) {
                    numsOutput.append(nums.get(i).toString());
                }
            } else {
                if (numsOutput.toString().equals("")) {
                    if (nums.get(i) > 100) {
                        numsOutput.append(nums.get(i).toString());
                    }
                } else {
                    numsOutput.append(", " + nums.get(i).toString());
                }
            }
        }
        System.out.println(numsOutput);
    }


    public static void main(String[] args) {

        IntScanner intScanner = new IntScanner();
        intScanner.convertInts("5;3;107;12;123;18;198");

        System.out.println();
        intScanner.convertInts("198");

        System.out.println();
        intScanner.convertInts("5;3;7;12;23;18;98");

        System.out.println();
        intScanner.convertInts("");
        }
}
