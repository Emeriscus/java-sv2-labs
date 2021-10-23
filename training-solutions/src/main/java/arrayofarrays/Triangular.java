package arrayofarrays;

public class Triangular {

    /*public void triangularMatrix(int size) {

        int[][] resultArrays = new int[size][];
        for (int i =0; i < size; i++) {
            resultArrays[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                resultArrays[i][j] = i;
                System.out.print(resultArrays[i][j] + " ");
            }
            System.out.println();
        }
    }*/

    public int[][] triangularMatrix(int size) {
        int[][] resultArrays = new int[size][];
        for (int i = 0; i < size; i++) {
            resultArrays[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                resultArrays[i][j] = i;
            }
        }
        return resultArrays;
    }

    public static void main(String[] args) {

        Triangular triangular= new Triangular();

        for (int[] i : triangular.triangularMatrix(8)) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
