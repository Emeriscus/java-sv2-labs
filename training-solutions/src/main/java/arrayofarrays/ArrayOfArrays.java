package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a[][] = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        arrayOfArrays.printArrayOfArrays(a);
    }
}
