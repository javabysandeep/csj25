package collectionFramework.listImplementations;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee employee) {
//        return this.salary-employee.salary;
        return this.name.compareTo(employee.name);
    }
}
