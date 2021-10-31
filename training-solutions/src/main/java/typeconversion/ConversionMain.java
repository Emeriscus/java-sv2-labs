package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(12.25));

        int[] nums = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println();
        System.out.println(conversion.convertIntArrayToByteArray(nums));

        for (byte i : conversion.convertIntArrayToByteArray(nums)) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(nums)));

        System.out.println();
        System.out.println(conversion.getFirstDecimal(12.65));
    }
}
