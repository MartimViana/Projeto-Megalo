package misc;
import java.util.*;
import entity.creature.*;

/**
 * Loads all the basic stats for the game.
 * @author Martim Viana
 *
 */
public class Loader {
	private List<Species> species;
	public Loader() {
		this.species = new ArrayList<Species>();
		
		//Load the lists
		loadSpecies();
	}
	
	public void loadSpecies() {
		species.add(new Species("Human", 10, 10));
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
	//
}
