package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] days = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int[] numbers = new int[5];
        numbers[0] = 1;
        for (int i = 1; i < 5; i++) {
            numbers[i] = numbers[i -1] * 2;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        boolean[] booleans = new boolean[6];

        booleans[0] = false;
        for (int i = 1; i< 6; i++) {
            booleans[i] = !booleans[i-1];
        }

        for (boolean item : booleans) {
            System.out.print(item + " ");
        }


    }
}
