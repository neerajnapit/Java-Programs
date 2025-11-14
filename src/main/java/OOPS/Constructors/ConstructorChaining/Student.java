package OOPS.Constructors.ConstructorChaining;

public class Student {
    String name;
    int roll;

    // No-argument constructor
    Student() {
        this("Unnamed", 0); // Calls two-argument constructor
    }

    Student(String n, int r) {
        name = n;
        roll = r;
    }
}