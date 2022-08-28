package controlStatements;

public class Pattern3 {
    public static void main(String[] args) {
        /*
        *****
        *****
        *****
        *****
        *****
        */
        int number = 5;
        for (int row = 1; row <=number ; row++) {
            for (int column = 1; column <=number; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
