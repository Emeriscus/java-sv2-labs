package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    CylinderCalculator cylinderCalculator = new CylinderCalculator();

    public double calculateVolume(double r, double h) {
        return cylinderCalculator.calculateVolume(r, h);
    }

    public double calculateSurfaceArea(double r, double h) {
        return cylinderCalculator.calculateSurfaceArea(r, h);
    }

}
