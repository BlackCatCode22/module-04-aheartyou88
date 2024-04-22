package aYZoo;
public class Tiger extends Animal {

    public final String color;
    public final double weight;
    public final String origin;

    Tiger(String color, double weight, String origin, String name, int age, String species) {
        super(name, age, species);
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }

}
