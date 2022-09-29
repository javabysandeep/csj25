package array;

import java.util.Scanner;

public class Demo18MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix1 = acceptMatrix();
        System.out.println("Transpose");
        int[][] transpose = transposeMatrix(matrix1);
        printMatrix(transpose);
      /*  int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrices(matrix1,matrix2);
        printMatrix(addition);
  */  }

    private static int[][] transposeMatrix(int[][] matrix1) {
        int[][] transpose = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < transpose.length; row++) {
            for (int column = 0; column < transpose[row].length; column++) {
                transpose[row][column] = matrix1[column][row];
            }
        }
        return transpose;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] addition = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < addition.length; row++) {
            for (int column = 0; column < addition[row].length; column++) {
                addition[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return addition;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row and column size");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix rows and columns element");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
