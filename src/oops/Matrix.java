package oops;


public class Matrix {
    int numberOfRows;
    int numberOfColumns;
    int[][] elements = new int[numberOfRows][numberOfColumns];

    public Matrix(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,3);
        for (int i = 0; i <matrix.elements.length ; i++) {
            System.out.println(matrix.elements[i]);
        }
//        Arrays.stream(matrix.elements).forEach(System.out::println);
    }
}
