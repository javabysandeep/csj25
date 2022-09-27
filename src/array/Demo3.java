package array;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int[] marks = {54,66,77,89,23};
        System.out.println(marks.length);

        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scanner.nextInt();
        int[] array = new int[size];


        System.out.println("Enter the array elements");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }
        System.out.println("Entered array elements");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

    }
}
