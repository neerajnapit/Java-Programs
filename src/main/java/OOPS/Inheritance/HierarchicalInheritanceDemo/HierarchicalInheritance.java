package OOPS.Inheritance.HierarchicalInheritanceDemo;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Output: Animal eats
        dog.bark(); // Output: Dog barks

        Cat cat = new Cat();
        cat.eat();  // Output: Animal eats
        cat.meow(); // Output: Cat meows
    }
}
