package misc;

public class Statistics {
	
	public Statistics() {}
	
	/**
	 * Rolls a random number between 1 and d
	 * @param d	The ammount of numbers
	 * @return
	 */
	public int roll(int d) {return (int) (1 + Math.random() * d);}
}
