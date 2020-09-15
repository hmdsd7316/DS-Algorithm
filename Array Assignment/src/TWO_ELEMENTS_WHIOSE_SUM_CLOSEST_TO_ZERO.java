import java.util.Arrays;

public class TWO_ELEMENTS_WHIOSE_SUM_CLOSEST_TO_ZERO {

	/**
	 * Sorting Approach
	 * 
	 * 1. Sort the array: This will bring all the negative elements at the front and
	 * positive elements at the end of the array. 2. Track 2 numbers, one positive
	 * numbers close to 0(positiveCLose)", and one negative number close to
	 * 0(negativeClose). 3. Take 2 pointers, one from the beginning of the array and
	 * another one from the end of the array. (i,j) 4. add A[i] + A[j, if sum > 0
	 * then reduce j(j--) and if sum is < 0 then increase i++ 5. if sum > 0 compare
	 * it with positiveClose, if postiveClose > sum, d positiveClose = sum. 6. If
	 * sum < 0 compare it with negativeClose, if negativeClose<sum, do negativeClose
	 * = sum. 7. Repeat the step 5, 6, 7 till i<j. 8. Return the minimum of absolute
	 * values of positiveClose and negativeClose, this will be the answer. 9. At any
	 * point if sum = 0 then return 0 since this will be the closest to the 0 is
	 * possible. 10. We can easily modify the code given below to track the two
	 * indexes as well for which the closest sum is possible.
	 * 
	 */

	public static int findSum(int[] a) {
		Arrays.sort(a);
		int i = 0;
		int j = a.length - 1;
		int positiveClose = Integer.MAX_VALUE;
		int negativeClose = Integer.MIN_VALUE;
		while (i < j) {
			int temp = a[i] + a[j];
			// check if temp is greater than 0
			if (temp > 0) {
				// check if positiveClose needs to be updated
				if (positiveClose > temp) {
					positiveClose = temp;
				}
				// decrement j, in order to reduce the difference, close to 0
				j--;
			} else if (temp < 0) {
				// check if negative needs to be updated
				if (negativeClose < temp) {
					negativeClose = temp;
				}
				// increment i, in order to reduce the difference, close to 0
				i++;
			} else {
				// means temp is 0, that is the closest to zero we can get, return 0
				return 0;
			}
		}
		// check the least absolute value in postiveClose and negativeClose
		return Math.min(Math.abs(positiveClose), Math.abs(negativeClose));
	}

	public static void main(String[] args) {
		int a[] = { 1, 4, -5, 3, -2, 10, -6, 20 };
		int closestSum = findSum(a);
		System.out.println("Sum close to zero in the given array is : " + closestSum);
	}
}
