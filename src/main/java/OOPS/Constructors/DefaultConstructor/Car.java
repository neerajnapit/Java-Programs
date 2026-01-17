package OOPS.Constructors.DefaultConstructor;

public class Car {
    String model;
    int year;

    // No constructor is defined, so Java creates one for us

    public static void main(String[] args) {
        Car myCar = new Car(); // Java calls the default constructor
        System.out.println(myCar.model); // null
        System.out.println(myCar.year);  // 0
    }
}