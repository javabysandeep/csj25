package array;

public class Demo17MultiDimensional {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {1, 2, 3, 4, 5},
                {4, 5, 6, 7}
        };
        System.out.println(arrayOfArray);
        System.out.println(arrayOfArray[0]);
        System.out.println(arrayOfArray[1]);

        System.out.println(arrayOfArray[0][0]);//1
        System.out.println(arrayOfArray[1][2]);//6

        //print all elements
        for (int row = 0; row < arrayOfArray.length ; row++) {
            for (int column = 0; column <arrayOfArray[row].length ; column++) {
                System.out.print(arrayOfArray[row][column]+" ");
            }
            System.out.println();
        }
    }
}
