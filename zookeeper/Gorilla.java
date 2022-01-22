package zookeeper;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public void throwSomething() {
		System.out.println("Watch out! Gorilla has thrown banana peels at you!");
		energyLevel -= 5;
	}

	public void eatBanana() {
		System.out.println("Snack time! Gorilla needs a tasty banana to recharge.");
		energyLevel += 10;
	}

	public void climb() {
		System.out.println("Up, up, and away! Gorilla is climbing high!");
		energyLevel -= 10;
	}
}