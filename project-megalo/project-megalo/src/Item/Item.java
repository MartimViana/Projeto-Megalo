package Item;

import entity.Entity;

public class Item extends Entity {
	private String name;
	private int id;
	private double weight;
	public Item(String name, int id, double weight) {
		this.name = name;
		this.id = id;
		this.weight = weight;
	}
	
	//Get functions
	public String name() {return this.name;}
	public int id() {return this.id;}
	public double weight() {return this.weight;}
}
