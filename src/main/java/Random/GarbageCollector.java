package Random;

public class GarbageCollector {

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }
        public static void main(String[] args) {
            Student s1 =  new Student("Alice");
            Student s2 = new Student("Bob");

            System.out.println("Before Assigning");
            System.out.println("S1 Object Name "+s1.name);
            System.out.println("S1 Object Name "+s2.name);

            s1 = s2;  // s1 now references the same object as s2
            // The original object "Alice" has no more references
            System.out.println("After Assigning");
            System.out.println("S1 Object Name "+s1.name);
            System.out.println("S1 Object Name "+s2.name);

            System.gc();  // Suggest JVM to run garbage collector (not guaranteed)
            // Will get removed once load on memory is high

            // At this point, the object "Alice" is eligible for garbage collection
        }
    }
