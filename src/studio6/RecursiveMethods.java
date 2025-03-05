package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
	    if (n == 0) {
	        return 0;  // base case: the first term is 1 (1/2^0)
	    } else {
	        return 1.0 / Math.pow(2, n) + geometricSum(n - 1);
	    }
	}

		
	

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		
		StdDraw.circle(xCenter, yCenter, radius);
    }
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	public static int[] toReversed(int[] array) {
	    // Clone the original array to avoid modifying it
	    int[] reversed = array.clone();
	    reverseRecursively(reversed, 0, reversed.length - 1);
	    return reversed;
	}

	// Helper method that recursively swaps the elements at positions start and end
	private static void reverseRecursively(int[] array, int start, int end) {
	    // Base case: when the start index is not less than the end index
	    if (start >= end) {
	        return;
	    }
	    // Swap elements at start and end indices
	    int temp = array[start];
	    array[start] = array[end];
	    array[end] = temp;
	    // Recursive call to continue reversing the remaining elements
	    reverseRecursively(array, start + 1, end - 1);
	}

	
	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but in reverse order
	 */

	/**
	 * Helper method that recursively fills the 'reversed' array.
	 *
	 * @param original the original array
	 * @param reversed the array to hold the reversed elements
	 * @param index the current index in the original array
	 */
	
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
	    if (q == 0) {
	        return p;
	    } else {
	        return gcd(q, p % q);
	    }
	}


}
