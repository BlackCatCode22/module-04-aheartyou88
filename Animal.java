package aYZoo;
public class Animal {

    // Animal Class attributes
    private String animalName;
    private int age;
    private String species;

//     Create a static attribute that belongs to the Animal class.
    public static int numOfAnimals = 0;

    // Animal Class constructors.
    public Animal(String aName, int anAge, String aSpecies) {
        System.out.println("\n A new Animal object was created.\n");

        // Create initial values for the class attributes.
        animalName = aName;
        age = anAge;
        species = aSpecies;
        numOfAnimals++;
    }

    public Animal() {
        System.out.println("\n A new Animal object was created.\n");
        numOfAnimals++;
    }

    // Getters and Setters for each attribute (optional, but recommended for good practice)
    public String getName() {
        return animalName;
    }


    public int getAge() {
        return age;
    }


    public String getSpecies() {
        return species;
    }



}