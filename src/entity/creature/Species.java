package entity.creature;

/**
 * 
 * @author Martim Viana
 *
 */
public class Species {
	private String name;
	private int health, armor;
	
	//The class constructor
	public Species(String name, int health, int armor) {
		this.name = name;
		this.health = health;
		this.armor = armor;
	}
	//Get methods
	public String name() {return this.name;}
	public int health() {return this.health;}
	public int armor() {return this.armor;}
}
