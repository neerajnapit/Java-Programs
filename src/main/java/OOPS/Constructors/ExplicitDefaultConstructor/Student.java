package OOPS.Constructors.ExplicitDefaultConstructor;

public class Student {
    String name;
    int roll;

    // No-arg constructor
    Student() {
        name = "Default";
        roll = 1;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name); // Default
        System.out.println(s.roll); // 1
    }
}