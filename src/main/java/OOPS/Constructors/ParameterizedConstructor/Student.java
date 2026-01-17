package OOPS.Constructors.ParameterizedConstructor;

public class Student {
    String name;
    int roll;

    // Parameterized constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    public static void main(String[] args) {
        Student s = new Student("Kunal", 7);
        System.out.println(s.name); // Kunal
        System.out.println(s.roll); // 7
    }
}