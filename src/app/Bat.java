package app;

/**
 * Bat
 */
public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }
    public void fly() {
        System.out.println("Bat is taking off to fly");
        this.energyLevel -= 50;
    }
    public void eatHumans() {
        System.out.println("Bat is eating humans");
        this.energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("Bat is atacking towns");
        this.energyLevel -= 100;
    }
}