package oops;

public class Employee {
    int salary;
    int numberOfWorkHours;

    void setEmployeeInformation(int salary, int numberOfWorkHours){
        this.salary = salary;
        this.numberOfWorkHours = numberOfWorkHours;
    }
    void addSalary(){
        if(this.salary < 500){
            this.salary +=10;
        }
    }
    void addWork(){
        if(this.numberOfWorkHours > 6){
            this.salary +=5;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeInformation(300,10);
        employee.addSalary();
        employee.addWork();
        System.out.println(employee.salary+"\t"+ employee.numberOfWorkHours);

    }
}
