package controlStatements;

public class Pattern6 {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        */
        int number = 5;
        for (int row = 1; row <=number ; row++) {
            for (int column = 1; column <=number; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
