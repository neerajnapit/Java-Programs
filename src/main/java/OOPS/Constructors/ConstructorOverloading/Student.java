package OOPS.Constructors.ConstructorOverloading;

public class Student {
    String name;
    int roll;

    Student() {
        name = "Default";
        roll = 0;
    }

    Student(String n) {
        name = n;
        roll = 0;
    }

    Student(String n, int r) {
        name = n;
        roll = r;
    }
}