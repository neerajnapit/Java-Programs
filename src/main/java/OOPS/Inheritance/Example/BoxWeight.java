package OOPS.Inheritance.Example;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // Call Box constructor
        this.weight = weight;
    }
}
