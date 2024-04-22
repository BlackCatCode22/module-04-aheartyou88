package aYZoo;

public class Lion extends Animal {

    public final String color;
    public final double weight;
    public final String origin;

    Lion(String color, double weight, String origin, String name, int age, String species) {
        super(name, age, species);
        this.color = color;
        this.weight = weight;
        this.origin = origin;

    }

}
