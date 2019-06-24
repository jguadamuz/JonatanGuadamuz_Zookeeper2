package app;

/**
 * Gorilla
 */
public class Gorilla extends Mammal{

    public void throwSomething() {
        System.out.println("The gorilla has thrown something to you!");
        this.energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("The gorilla is satisfied, he loved the banana!");
        this.energyLevel += 10;
    }

    public void climb() {
        System.out.println("The gorilla just climbed a tree!");
        this.energyLevel -= 10;
    }
 }