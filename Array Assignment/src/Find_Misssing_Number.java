public class Find_Misssing_Number {

	/* How to find the missing number in integer array of 1 to 100? */
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 5, 6, 7, 8, 9 };
		System.out.println("Missing no is: " + findMissingNo_1(array, array.length));
		System.out.println("Missing no is: " + findMissingNo_XOR(array, array.length));
		System.out.println("Missing no is: " + findMissingNo_SUM(array, array.length));
		System.out.println("Missing no is: " + findMissingNo_Overlow(array, array.length));
		System.out.println("Missing no is: " + findMssingNo_Sorting());
	}

	/* 1. WORST solution is (thought by me) but not which companies are looking for. 
	 * Pick each no from 1 to N (100), check if any no missing into the array.
	 * Time Complexity:- O(n2)
	 * Space Complexity:- O(1)
	 * */
	private static int findMissingNo_1(int array[], int size) {

		for (int i = 1; i <= size; i++) {
			boolean found = false;
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					found = true;
				}
			}

			if (!found) {
				return i;
			}
		}

		return 0;
	}
	
	/* 2. Second solution is we can utilize the property of XOR. 
	 * The property of XOR that we will be using is A XOR A = 0.
	 * 
	 * Step 1: XOR all the numbers from 1 to n. e.x num1.
	 * Step 2: XOR all the elements of the array. e.x num2.
	 * Step 3: Get the XOR of num1 and num2.
	 * 
	 * Since all the elements are repeated, the XOR becomes 0 and the only number that does not becomes zero is the missing number.
	 * */
	
	private static int findMissingNo_XOR(int[] a, int n) {
		int x1 = a[0]; 
        int x2 = 1; 
  
        /* For XOR of all the elements in array */
        for (int i = 1; i < n; i++) 
            x1 = x1 ^ a[i]; 
  
        /* For XOR of all the elements from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++) 
            x2 = x2 ^ i; 
  
        return (x1 ^ x2); 
        
        // Time Complexity : O(n)
	}
	
	
	/* Another solution as even small complexity and requires a s single of the array. 
	 * 1. Get the sum of numbers till N using summation formula. ((n) * (n+1)) / 2
	 * 2. Sum of all the array elements.
	 * 3.Subtract the sum of the array from to the totalN sum. This gives us the missing number 
	 * 
	 * */
	private static int findMissingNo_SUM(int[] array, int nLength) {
		
		// Sum of N
		int nSum = (nLength * (nLength+1)) / 2;
		
		// Sum of array elements
		int elementSum = 0;
		for(int i=0; i<array.length-1; i++) {
			elementSum += array[i];
		}
		
		return (nSum - elementSum);
		
		
		// Time Complexity:- O(n) for scanning the complete array
		// Space Complexity:- O(1)	
	}
	
	/* Above program can be overflow if n is large. N sums can go outside the range of integer.
	 * In order to avoid Integer, we can sum and subtract in each loop one by one. Instead of a single time.
	*/ 
	
	private static int findMissingNo_Overlow(int[] array, int nLength) {
		
		int total=1;
		for(int i=2; i <= nLength+1; i++) {
			total += i;
			total -= array[i-2];
		}
		
		return total;
	}
	
	/* We can also use another method to find the missing number in an array. 
	 * This technique involves sorting the array. Sort the array and give it a linear scan, 
	 * if there is a difference between index and the array element, that number is the missing number.
	 * int[] array = new int[] { 1, 3, 2, 5, 7, 9, 8, 6 };
	 * */
	
	private static int findMssingNo_Sorting() {
		// given array
		int[] array = new int[] { 1, 3, 2, 5, 7, 9, 8, 6 };
		int size = array.length;
		
		
		// perform sorting algorithm.
		int[] sortedArray = new int[] { 1, 2, 3, 5, 6, 7, 8, 9 };
		//loop through integers 1 to size
		for(int i=0; i< size; i++) {
			if(sortedArray[i] != (i+1)) {
				// missing no.
				return i+1;
			}
		}
		
		return 0;
	}
}
