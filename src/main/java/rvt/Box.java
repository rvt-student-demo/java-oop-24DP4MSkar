package rvt;
import java.util.ArrayList;


public class Box implements Packable {
 
    private ArrayList<Packable> box;
    private double capacity;
 
    public Box(double capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }
 
    public void add(Packable item) {
        if (item.weight() + weight() <= this.capacity) {
            box.add(item);
        }
    }
 
    public double weight() {
        double weight = 0;
        for (Packable item : box) {
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + 
                weight() + " kg";
    }
}
 
