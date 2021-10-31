package conversions;

public class TooBigNumber {

    public void getRightResult(int number) {

        System.out.println((long)2_147_483_647 + number);

    }

    public static void main(String[] args) {

    TooBigNumber tooBigNumber = new TooBigNumber();
    tooBigNumber.getRightResult(1000);

    }
}
