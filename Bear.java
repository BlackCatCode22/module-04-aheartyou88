package aYZoo;
public class Bear extends Animal {

    public final String color;
    public final double weight;
    public final String origin;

    Bear(String color, double weight, String origin, String name, int age, String species) {
        super(name, age, species);
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }
}
