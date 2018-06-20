package engine;
import graphics.Screen;
import misc.Loader;
import misc.Statistics;

/**
 * This class is responsible for fundemental game loop
 * @author Martim Viana
 *
 */
public class Engine implements Runnable{
	private Screen mainScreen;
	private Loader load;
	/**
	 * Sets up the starting conditions for the engine to run.
	 */
	public Engine() {
		//Creating a new loader
		this.load = new Loader();
		
		//Configuring the main screen
		this.mainScreen = new Screen(600, 800, "project megalo");
		this.mainScreen.visible(true);
		//End of main screen configuration
		new Thread(this).run();	//Runs the game loop
	}
	
	
	/**
	 * This is the fundemental game loop.
	 */
	public void run() {
		//TODO need to count the ammount of fps!
		
		//Statistics dice = new Statistics();
		while(true) {
			
			render();	//Refreshes the graphics
		}
	}
	
	/**
	 * Refreshes the entire screen graphic-wise.
	 */
	private void render() {
		
	}
}
