package exceptionHandling;

import java.util.Scanner;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(1,"akash");
        //Student student1 = (Student)student.clone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        Thread thread = new Thread(()->{
            System.out.println("theard running");
        });
        thread.start();
//        thread.start();
        String str = "abc";
        System.out.println(str.charAt(5));
    }
}
