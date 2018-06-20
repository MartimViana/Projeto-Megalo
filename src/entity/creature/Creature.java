package entity.creature;
import entity.*;

public class Creature extends Entity{
	private String name;
	private Species species;
	int level;
	//Parameters
		private int health;
		private int armor;
		private int initiative;
		private int speed;
		private double carry_weight;
		//Abilities
			private int strength;
			private int dextery;
			private int constitution;
	
	public Creature(String name, Species species) {
		this.species = species;
		this.health = species.health();
		this.armor = species.armor();
		this.name = name;
	}
	
	//Get methods
	public String name() {return this.name;}
	public int health() {return this.health;}
	public int armor() {return this.armor;}
	
	//Misc. Functions
	public boolean checkIfDead() {
		if(health <= 0)
			return true;
		else
			return false;
	}
}
