package controlStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        if(year%400==0 || (year%100!=0 && year%4==0) ){
            System.out.println("Its a leap year");
        } else{
            System.out.println("Not a leap year");
        }
    }
}
