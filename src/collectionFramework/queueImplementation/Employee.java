package collectionFramework.queueImplementation;

public class Employee /*implements Comparable<Employee>*/{
    int id;
    String name;
    int salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   /* @Override
    public int compareTo(Employee o) {
        return o.salary-this.salary;
    }*/
}
