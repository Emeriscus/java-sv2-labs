package arrayofarrays;

public class Rectangle {

    public int[][] rectangularMatrix(int size) {
        int [][] rectangle = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rectangle[i][j] = i;
            }
        }
        return rectangle;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        for (int i[] : rectangle.rectangularMatrix(6)) {
            for (int j :i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        int[][] assist = rectangle.rectangularMatrix(6);
        for (int i = 0; i < assist.length; i++) {
            for (int j = 0; j < assist.length; j++) {
                System.out.print(assist[i][j]);
            }
            System.out.println();
        }

    }
}
