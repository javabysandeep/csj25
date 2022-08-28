package controlStatements;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int oldNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }
        System.out.println(oldNumber == sum ? "armstrong" : "not a armstrong");
    }
}
