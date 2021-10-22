package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(11));
        System.out.println(introControl.subtractTenIfGreaterThanTen(9));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Bill"));

        System.out.println(introControl.calculateBonus(1_000_000));
        System.out.println(introControl.calculateBonus(999_999));
        System.out.println(introControl.calculateBonus(1_000_001));

        /* ez még hiányzik:
        introControl.calculateConsumption();
         */

        introControl.printNumbers(10);

        introControl.printNumbersBetween(2, 5);
        introControl.printNumbersBetween(0, 10);

        introControl.printNumbersBetweenAnyDirection(0, 5);
        introControl.printNumbersBetweenAnyDirection(11, 2);

        introControl.printOddNumbers(10);
        introControl.printOddNumbers(9);

    }
}
