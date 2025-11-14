package OOPS.Inheritance.MultipleInheritanceDemo;

public class Dog implements Runnable , Swimmable {
    public void run() {
        System.out.println("Dog runs");
    }

    public void swim() {
        System.out.println("Dog swims");
    }
}
