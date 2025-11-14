package OOPS.Constructors.FullWorkingProgram;

public class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        model = "Unknown";
        year = 2020;
    }

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // Default
        Car car2 = new Car("Hyundai", 2023); // Parameterized

        System.out.println(car1.model + " " + car1.year); // Unknown 2020
        System.out.println(car2.model + " " + car2.year); // Hyundai 2023
    }
}