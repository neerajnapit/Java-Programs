package OOPS.Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
