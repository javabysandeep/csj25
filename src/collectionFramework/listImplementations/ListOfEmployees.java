package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees {
    public static void main(String[] args) {
        Employee employee1 =  new Employee(11,"abc",4000);
        Employee employee2 =  new Employee(1,"xyz",15000);
        Employee employee3 =  new Employee(12,"pqr",155000);
        Employee employee4 =  new Employee(2,"alpha",105500);
        Employee employee5 =  new Employee(3,"beta",10010);
        Employee employee6 =  new Employee(4,"gama",11000);
        Employee employee7 =  new Employee(19,"dddd",900);

        List list = new ArrayList();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);

//        System.out.println(getEmployeesBasedOnSalary(list,10000));
        for (Object emp:getEmployeesBasedOnSalary(list,10000)) {
            System.out.println(emp);
        }

    }
    static List getEmployeesBasedOnSalary(List<Employee> employeeList, int salary){
        List employees = new ArrayList<>();
        for (Employee emp:employeeList) {
            if(emp.salary >=salary){
                employees.add(emp);
            }
        }
        return employees;
    }
}
