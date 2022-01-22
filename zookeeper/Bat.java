package zookeeper;

public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }
    public void fly() {
        System.out.println("Flap-flap-plap... flap-flap-flap... WOOSH!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("...crackle...hiss...fires roar...");
        energyLevel += 100;
    }
}