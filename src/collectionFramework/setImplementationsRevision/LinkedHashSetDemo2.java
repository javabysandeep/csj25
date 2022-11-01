package collectionFramework.setImplementationsRevision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"abc",1000);
        Employee employee2 = new Employee(2,"abc",1000);
        Employee employee3 = new Employee(3,"abc",1000);
        Employee employee4 = new Employee(4,"abc",1000);
        Employee employee5 = new Employee(5,"abc",1000);

        Set<Employee> set = new LinkedHashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        set.forEach(System.out::println);
    }
}
