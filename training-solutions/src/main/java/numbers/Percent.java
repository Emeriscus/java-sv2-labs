package numbers;

public class Percent {

    public double getValue(int num1, int num2) {

        return (double) num1 * num2 /100;
    }

    public double getBase(int num1, int num2) {

        return (double) num1 / num2 *100;

    }

    public double getPercent(int num1, int num2) {

        return (double) num2 / num1 *100;
    }


    public static void main(String[] args) {

    Percent percent = new Percent();

        System.out.println(percent.getValue(200, 30));
        System.out.println(percent.getBase(60, 30));
        System.out.println(percent.getPercent(80, 60));

    }
}
