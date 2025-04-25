// Animal.java
public class Animal {
    protected String habitat;
    protected int lifespan;

    public Animal() {
        this.habitat = "Unknown";
        this.lifespan = 0;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Habitat: " + habitat);
        System.out.println("Lifespan: " + lifespan + " years");
    }
}
