package sorting;

import java.util.Arrays;

public class Selection {
	
	public static void main(String[] args) {
		int[] array = new int[] {3, 6, 1, 8, 4, 5};
		
		for(int i=0; i<array.length-1; i++) {
			
			int index = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[index] > array[j]) {
					index = j;
				}
			}
		
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
