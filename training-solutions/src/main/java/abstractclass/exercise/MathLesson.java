package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {

        MathExercise adder = new Adder();
        MathExercise divisor = new Divisor();
        MathExercise multiplier = new Multiplier();
        MathExercise subtracter = new Subtracter();

        System.out.println(adder.getSolution(10, 20));
        System.out.println(divisor.getSolution(3, 4));
        System.out.println(multiplier.getSolution(10, 20));
        System.out.println(subtracter.getSolution(10, 20));
    }
}
