package exceptionHandling;

import java.util.Scanner;

public class Demo15CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        if(age < 18){
            throw  new InvalidAgeException("You are under age.");
        }else {
            System.out.println("your are eligible for voting");
        }

    }
}
