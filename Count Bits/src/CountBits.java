/**
 * 
 */

/**
 * @author saima
 *
 */

import java.util.Scanner;

public class CountBits {

	/**
	 * @param args
	 */
	
	public static short countBits(int x) {
		short res = 0;
		while(x != 0) {
			res += (x & 1);
			x = x >>> 1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// Get the input number to count bits and print number of bits to output 
		System.out.println("Enter input number : ");
		Scanner sc  = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Number of one bits in "+input+" is "+countBits(input));
	}

}
