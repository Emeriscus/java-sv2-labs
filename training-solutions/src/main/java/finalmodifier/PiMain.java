package finalmodifier;

public class PiMain {
    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

        double r = 3;
        double h = 10;

        System.out.println(circleCalculator.calculateArea(r));
        System.out.println(circleCalculator.calculatePerimeter(r));
        System.out.println(cylinderCalculator.calculateVolume(r, h));
        System.out.println(cylinderCalculator.calculateSurfaceArea(r, h));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(r, h));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(r, h));
    }
}
