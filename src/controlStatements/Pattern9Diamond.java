package controlStatements;

public class Pattern9Diamond {
    public static void main(String[] args) {
        /*
          *
         * *
        * * *
       * * * *
      * * * * *
       * * * *
        * * *
         * *
          *

         */

        int number = 50;
        for (int row = 1; row <= number; row++) {
            for (int space = number-row; space >1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <=row ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <=number; row++) {
            for (int space = 1; space <row; space++) {
                System.out.print(" ");
            }
            for (int star = number-row; star >=1; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower triangle



    }
}
