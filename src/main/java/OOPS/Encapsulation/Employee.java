package OOPS.Encapsulation;

public class Employee {
    private int salary;  // Private variable

    // Getter method to access salary
    public int getSalary() {
        return salary;
    }

    // Setter method to modify salary
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

