package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double num) {

        return ((int) num);
    }

    public byte[] convertIntArrayToByteArray(int[] nums) {
        byte[] results = new byte[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] > 127) {
                results[i] = -1;
            } else {
                results[i] = (byte) nums[i];
            }
        }
        return results;
    }

    public int getFirstDecimal(double num) {

        return (int)((num - (int) num) * 10);

    }
}
