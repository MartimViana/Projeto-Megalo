package misc;

public class Statistics {
	
	public Statistics() {}
	
	/**
	 * Rolls a random number between 1 and d
	 * @param d	The number of sides the simulated dice holds.
	 * @return	The dice result.
	 */
	public int roll(int d) {return (int) (1 + Math.random() * d);}
	/**
	 * Rolls a random number between 1 and d and adds a given modifier.
	 * @param d	The number of sides the simulated dice holds.
	 * @param modifier
	 * @return	The dice result.
	 */
	public int roll(int d, int modifier) {return (int) (1 + Math.random() * d + modifier);}
	/**
	 * Calculates the mean of an array of integers.
	 * @param arr	The array of integers.
	 * @return		The mean value of the array of integers.
	 */
	public double mean(int[] arr) {
		int result = 0;
		for(int i: arr)
			result += i;
		return (result / arr.length);
	}
}
