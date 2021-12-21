package interfacedependencyinversion.box;

public class CourierCompany {

    public static void main(String[] args) {

        SmallBox smallBox = new SmallBox();
        MediumBox mediumBox = new MediumBox();
        LargeBox largeBox = new LargeBox();
        ExtraLargeBox extraLargeBox = new ExtraLargeBox();

        System.out.println(smallBox.getSize());
        System.out.println(smallBox.getPrice());

        System.out.println(mediumBox.getSize());
        System.out.println(mediumBox.getPrice());

        System.out.println(largeBox.getSize());
        System.out.println(largeBox.getPrice());

        System.out.println(extraLargeBox.getSize());
        System.out.println(extraLargeBox.getPrice());
    }
}
