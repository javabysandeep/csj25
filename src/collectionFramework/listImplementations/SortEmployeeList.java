package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeeList {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11, "abc", 4000);
        Employee employee2 = new Employee(1, "xyz", 15000);
        Employee employee3 = new Employee(12, "pqr", 155000);
        Employee employee4 = new Employee(2, "alpha", 105500);
        Employee employee5 = new Employee(3, "beta", 10010);
        Employee employee6 = new Employee(4, "gama", 11000);
        Employee employee7 = new Employee(19, "dddd", 900);

        List<Employee> unsortedEmployeeList = new ArrayList();
        unsortedEmployeeList.add(employee1);
        unsortedEmployeeList.add(employee2);
        unsortedEmployeeList.add(employee3);
        unsortedEmployeeList.add(employee4);
        unsortedEmployeeList.add(employee5);
        unsortedEmployeeList.add(employee6);
        unsortedEmployeeList.add(employee7);

        for (Employee emp:unsortedEmployeeList) {
            System.out.println(emp);
        }
        //sort the employees
        System.out.println("After sorting the employee list");
        //sort method from collections accepts the list objects of type Comparable
        Collections.sort(unsortedEmployeeList);
        for (Employee emp:unsortedEmployeeList) {
            System.out.println(emp);
        }
    }
}
