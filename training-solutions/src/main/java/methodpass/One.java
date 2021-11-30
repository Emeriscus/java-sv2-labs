package methodpass;

public class One {

    public static void main(String[] args) {

        int number = 0;

        System.out.println(number);

        number++;

        System.out.println(number);

        new One().addOne(number);

        System.out.println(number);
    }

    public int addOne(int number) {
        return number++;
    }
}
