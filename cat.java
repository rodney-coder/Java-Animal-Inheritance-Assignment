// Cat.java
public class Cat extends Animal {
    public Cat() {
        this.habitat = "Domestic environments";
        this.lifespan = 15;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat barks! (surprise!)");
    }

    public void scratch() {
        System.out.println("Cat is scratching the furniture!");
    }
}
