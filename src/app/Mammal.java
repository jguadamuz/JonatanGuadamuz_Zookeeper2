package app;

class Mammal {
    protected boolean sleeping = false;
    protected int energyLevel = 100;

    public void regulateTemperature() {
        System.out.println("My temperature is just right now.");
    }

    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public int displayEnergy() {
        System.out.println("Energy level at " + this.energyLevel);
        return this.energyLevel;
    }
}
