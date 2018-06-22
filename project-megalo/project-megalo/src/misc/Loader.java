package misc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entity.creature.Species;
import graphics.Tile;

/**
 * Loads all the basic stats for the game.
 * @author Martim Viana
 *
 */
public class Loader {
	private List<Species> species;
	private Map test_map;
	public Loader() {
		this.species = new ArrayList<Species>();	//Initializes the species list
		
		//Load the lists
		loadSpecies();
	}
	
	public void loadSpecies() {
		species.add(new Species("Human", 100, 20));
	}
	
	//Finding the species
	public Species findSpecies(String name) {
		return DCfindSpecies(name, 0, species.size()/2, species.size());
	}
	/**
	 * The divide and conquest algorithm for finding the right species.
	 * @param name	The name of the species.
	 * @param left	The left margin.
	 * @param pivot	The middle margin.
	 * @param right	The right margin.
	 * @return	The species whose name matches the given name.
	 */
	private Species DCfindSpecies(String name, int left, int pivot, int right) {
		Species Sleft = DCfindSpecies(name, left, (int)(pivot/2), pivot);
		Species Sright = DCfindSpecies(name, pivot, (int)(right+pivot)/2, right);
		if(species.get(pivot).name().equals(name))
			return species.get(pivot);
		if(!Sleft.equals(null))
			return Sleft;
		else if(!Sright.equals(null))
			return Sright;
		else
			return null;
	}
	
	/**
	 * Loads a game-testing room surrounded by walls.
	 * @param x
	 * @param y
	 * @param z
	 */
	public void loadTestMap(int x, int y, int z) {
		Tile[][][] tileTest = new Tile[x][y][z];
		int health = (int)Math.pow(2, 32) - 1;
		String type = "";
		boolean isPassable = true;
		for(int i = 0; i < z; i++) {				//Z
			for(int j = 0;j < y; j++)				//Y
				for(int k = 0; k < x; k++) {		//X
					if(i == 0 || j == 0 || k == 0 || i == z-1 || j == y-1 || k == x-1) {
						type = "X";
						isPassable = false;
					}
					else {
						type = ".";
						isPassable = true;
					}
				}
		}
	}
}
