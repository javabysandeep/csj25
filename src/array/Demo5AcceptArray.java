package array;

import java.util.Scanner;

public class Demo5AcceptArray {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        //array size cannot be in boolean, float, double, long
        int[] array = new int[arraySize];

        System.out.println("Enter the array elements ");
        for (int index = 0; index < array.length; index++) {
            array[index]= scanner.nextInt();
        }
        System.out.println("Printing the array elements ");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
