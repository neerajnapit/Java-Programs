package OOPS.Inheritance.SuperKeywordDemo;

public class Dog extends Animal {
    String color = "black";
    Dog() {
        super(); // Calls Animal constructor
        System.out.println("Dog created");
    }
    void printColor() {
        System.out.println(super.color); // Output: white
        System.out.println(color);       // Output: black
    }
    void eat() {
        super.eat();    // Calls Animal's eat
        System.out.println("Dog eats");
    }
}
