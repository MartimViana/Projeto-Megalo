package Item;

public class Weapon extends Item{
	private boolean ranged;
	private boolean throwable;
	private int damage;
	private int ammo;
	public Weapon(String name, int id, int weight, boolean ranged, boolean throwable, int damage, int ammo) {
		super(name, id, weight);
		this.ranged = ranged;
		this.throwable = throwable;
		this.damage = damage;
		this.ammo = ammo;
	}
	
	//Get functions
	public boolean ranged() {return this.ranged;}
	public boolean throwable() {return this.throwable;}
	public int damage() {return this.damage;}
	public int ammo() {return this.ammo;}
}
