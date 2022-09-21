package oops.composition;

public class Employee {
    //composition means has - a type relationship
    int employeeId;
    String employeeName;
    Address address;

    public Employee(int employeeId, String employeeName, Address address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", address=" + address +
                '}';
    }
}
