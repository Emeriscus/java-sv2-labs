package operators;

public class HeadingNorth {

    public void getNumberOfNewDirections() {

        int degree = 0;
        int numberOfDirections = 0;

//        for (int i = 1; i < 15; i++) {
//            degree = degree + (i * 10);
//            if (Math.floorDiv(360, degree) >= 1) {
//                numberOfDirections = i;
//            } else { System.out.println(numberOfDirections); }
//
//        }
//    }

        for (int i = 0; degree < 360; i += 10) {
            degree += i;
            numberOfDirections++;
        }
        System.out.println(numberOfDirections - 1);
    }

    public static void main(String[] args) {

        HeadingNorth headingNorth = new HeadingNorth();

        headingNorth.getNumberOfNewDirections();

//        int fr = Math.floorMod(6, 5);
//        System.out.println(fr);
//        System.out.println(Math.floorDiv(360, 370));


    }
}
