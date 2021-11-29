package methodstructure.bmi;

import com.sun.source.tree.CaseTree;

public class BodyMass {

    private double weight;
    private double height;


    public double getBodyMassIndex() {

        return weight / (height * height);
    }

    public BmiCategory getBody() {

        if (getBodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        if (getBodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other) {

        return this.getBodyMassIndex() < other.getBodyMassIndex();
    }

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
