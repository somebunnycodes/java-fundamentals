package zookeeper;

public class Mammal {

    protected int energyLevel = 500;

    public int displayEnergy() {
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
	}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}