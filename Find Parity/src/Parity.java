/**
 * 
 */
import java.util.Scanner;
/**
 * @author saima
 *
 */
public class Parity {

	/**
	 * Bruteforce method O(n) time complexity
	 */
	public static short parity(long x) {
		short result = 0;
		while(x != 0) {
			result ^= (x & 1);
			x >>>= 1;
		}
		return result;
	}
	/**
	 * First improvement O(k) time complexity, where k is set bits
	 */	
	public static short firstImpParity(long x) {
		short result = 0;
		while(x != 0) {
			result ^= 1;
			x &= (x-1);
		}
		return result;
	}
	
	
	/* Using lookup table O(n/L)
	public static short parity(long x) {
		final int MASK_SIZE = 16;
		final int BIT_MASK = 0xFFFF;
		
	}
	*/
	
	/**
	 * Second improvement O(log n) time complexity, where n is number of bits
	 */	
	public static short thirdImpParity(long x) {
		x ^= x >> 32;
		x ^= x >> 16;
		x ^= x >> 8;
		x ^= x >> 4;
		x ^= x >> 2;
		x ^= x >> 1;
		return (short)(x & 0x1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number (long) : ");
		long input = sc.nextLong();
		System.out.println("O(n) Parity of "+input+" is "+parity(input));
		System.out.println("first Improvement O(k) Parity of "+input+" is "+firstImpParity(input));
		System.out.println("Third Improvement O(log n) Parity of "+input+" is "+thirdImpParity(input));
	}

}
