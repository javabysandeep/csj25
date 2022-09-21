package oops.composition;

public class Composition {
    public static void main(String[] args) {
        Address address = new Address();
        address.city= "Pune";
        Employee  employee = new Employee(1, "Aditya",address);
        System.out.println(employee);
    }
}
