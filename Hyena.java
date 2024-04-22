package aYZoo;

public class Hyena extends Animal {

    public final String color;
    public final double weight;
    public final String origin;

    Hyena(String color, double weight, String origin, String name, int anAge, String aSpecies) {

        super(name, anAge, aSpecies);
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }

}
