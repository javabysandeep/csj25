package controlStatements;

public class Pattern4 {
    public static void main(String[] args) {
        /*
        1 1 1 1 1
        1 1 1 1 1
        1 1 1 1 1
        1 1 1 1 1
        1 1 1 1 1
        */
        int number = 5;
        for (int row = 1; row <=number ; row++) {
            for (int column = 1; column <=number; column++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
