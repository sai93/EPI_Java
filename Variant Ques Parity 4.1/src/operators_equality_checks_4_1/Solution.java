/**
 * 
 */
package operators_equality_checks_4_1;

import java.util.Scanner;
/**
 * @author saima
 *
 */
public class Solution {

	/**
	 * Propagates the right most set bit in x O(1) run time, O(1) space complexity
	 */
	public static long propogateRight(long x) {
		return (x | (x-1));
	}
	
	/**
	 * Computes the mod value of dividend % divider using bitwise operators O(1) run time, O(1) space complexity
	 */
	public static long computeMod(long dividend, long divider) {
		System.out.println("mod = "+dividend % divider);
		  return (dividend & (divider-1));
		
	}
	
	/**
	 * Returns true, if x can be represented by power of 2 O(1) run time, O(1) space complexity
	 */
	public static boolean checkPow2(long x) {
		if((x & (x-1)) == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// Calling the methods declared above
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to propagate the right most set bit : ");
		long input = sc.nextLong();
		System.out.println("The output after propagating right most set bit is : "+propogateRight(input));
		System.out.println("Enter Dividend and Divider to compute mod");
		System.out.println("Enter Dividend : ");
		long dividend = sc.nextLong();
		System.out.println("Enter Divider : ");
		long divider = sc.nextLong();
		System.out.println("The output mod value Dividend % Divider = "+computeMod(dividend, divider));
		System.out.println("Enter a long value to check if it can be represented by power of 2 : ");
		long checkVal = sc.nextLong();
		System.out.println("ouput true/false : "+checkPow2(checkVal));
	}

}
