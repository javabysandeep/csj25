package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfEmployees1 {
    public static void main(String[] args) {
        System.out.println("How many employees you want  to add ");
        Scanner scanner = new Scanner(System.in);
        int employeeCount = scanner.nextInt();
        List list = new ArrayList<>();

        for (int index = 1; index <=employeeCount ; index++) {
            System.out.println("Enter the employee record details");
            Employee employee = new Employee();
            employee.id = scanner.nextInt();
            employee.name = scanner.next();
            employee.salary = scanner.nextInt();
            list.add(employee);
        }
        System.out.println("Entered data");
        System.out.println(list);



    }
}
