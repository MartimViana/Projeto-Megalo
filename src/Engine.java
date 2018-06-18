/**
 * This class is responsible for fundemental game loop
 * @author Martim Viana
 *
 */
public class Engine implements Runnable{
	/**
	 * Sets up the starting conditions for the engine to run.
	 */
	public Engine() {
		new Thread(this).run();	//Runs the game loop
	}
	
	
	/**
	 * This is the fundemental game loop.
	 */
	public void run() {
		//TODO need to count the ammount of fps!
		while(true) {
			System.out.println("Engine.run");
			
		}
	}
	
	/**
	 * Refreshes the entire screen graphic-wise.
	 */
	public void render() {
		
	}
}
