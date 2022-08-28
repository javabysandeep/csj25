package controlStatements;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        //allowed: byte, short, int, char,and wrapper classes string, enum
        //not allowed: float, double, long, boolean
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        switch (month) {
            default:
                System.out.println("invalid number");
                break;
            case 5-4:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
        }
        System.out.println("Rest of the code");
    }

    private static int dec() {
        return 12;
    }
}
