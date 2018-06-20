package misc;

public class Statistics {
	
	public Statistics() {}
	
	/**
	 * Rolls a random number between 1 and d
	 * @param d	The ammount of numbers
	 * @return
	 */
	public int roll(int d) {return (int) (1 + Math.random() * d);}
	
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
