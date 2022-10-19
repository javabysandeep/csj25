package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEmployee {
    public static void main(String[] args) {
        Employee employee1 =  new Employee(11,"abc",4000);
        Employee employee2 =  new Employee(11,"abc",4000);
        Employee employee3 =  new Employee(12,"pqr",155000);
        Employee employee4 =  new Employee(2,"alpha",105500);
        Employee employee5 =  new Employee(3,"beta",10010);
        Employee employee6 =  new Employee(4,"gama",11000);
        Employee employee7 =  new Employee(19,"dddd",900);
        Employee employee8 =  new Employee(19,"dddd",900);

        Set<Employee> employeeSet = new LinkedHashSet<>();

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);
        employeeSet.add(employee7);
        employeeSet.add(employee8);

        employeeSet.forEach(System.out::println);
    }
}
