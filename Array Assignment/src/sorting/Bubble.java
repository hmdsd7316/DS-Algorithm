package sorting;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		
		// Optimized
		int iterartion = 0;
		int[] array1 = new int[] { 1, 2, 5, 4, 3, 7, 6 };
		for (int i = 0; i < array1.length; i++) {
			boolean anySwap = false;
			for (int j = 0; j < (array1.length - i) - 1; j++) {
				iterartion++;
				if (array1[j] > array1[j+1]) {
					anySwap = true;
					int temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}
			}

			if (!anySwap) {
				break;
			}
		}

		System.out.println(Arrays.toString(array1));
		System.out.println("Iteration: " + iterartion);
	}
}
