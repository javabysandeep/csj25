package controlStatements;

public class Pattern8 {
    public static void main(String[] args) {
        /*
          *
         * *
        * * *
       * * * *
      * * * * *

         */
        int number = 5;
        for (int row = 1; row <= number; row++) {
            for (int space = number-row; space >1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <=row ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
