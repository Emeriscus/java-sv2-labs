package arrayofarrays;

public class DailyValues {

    public int[][] getValues() {

        int[][] getvalues = new int[12][];
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < days.length; i++) {
            getvalues[i] = new int[days[i]];
        }
        return getvalues;
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
/*        int[][] assistArray = dailyValues.getValues();
        for (int i = 0; i < assistArray.length; i++) {
            for (int j = 0; j < assistArray[i].length; j++) {
                System.out.print(assistArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();*/
        for (int i[] : dailyValues.getValues()) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
