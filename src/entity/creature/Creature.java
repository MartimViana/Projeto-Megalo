package entity.creature;
import entity.*;

public class Creature extends Entity{
	private String name;
	private Species species;
	private int health, armor;
	
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
}
