/**
 * 
 */
package evenOddArray;

import java.util.*;

/**
 * @author saima
 * Rearranges the given array with even numbers first
 *
 */
public class ResultArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Integer[] inputArray = {1,2,3,4};
		Arrays.sort(inputArray, new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				if(a % 2 == 0 && b % 2 != 0)
					return -1;
				else if((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0) )
					return 1;
				return 1;
			}
		});
		for(int i = 0; i < inputArray.length; ++i) {
			System.out.println(inputArray[i]);
		}
		*/
		int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
		int nextEven = 0;
		int end = inputArray.length-1;
		while (nextEven < end) {
			if(inputArray[nextEven] % 2 == 0) {
				++nextEven;
			}
			else {
				int tmp = inputArray[nextEven];
				inputArray[nextEven] = inputArray[end];
				inputArray[end--] = tmp;
			}
		}
		for(int i = 0; i < inputArray.length; ++i) {
			System.out.println(inputArray[i]);
		}		
	}

}
