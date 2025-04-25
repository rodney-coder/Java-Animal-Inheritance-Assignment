// MainAnimal.java
public class MainAnimal {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();
        genericAnimal.displayInfo();

        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.scratch();
        myCat.displayInfo();
    }
}
