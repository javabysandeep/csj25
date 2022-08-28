package controlStatements;

public class Pattern5 {
    public static void main(String[] args) {
        /*
        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5
        */
        int number = 5;
        for (int row = 1; row <=number ; row++) {
            for (int column = 1; column <=number; column++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
