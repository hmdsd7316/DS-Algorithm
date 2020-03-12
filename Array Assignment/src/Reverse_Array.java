import java.util.Arrays;

public class Reverse_Array {
	
	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		
		reverseArray(array1);
		reverseArray(array2);
	}
	
	private static void reverseArray(int[] array1) {
		for(int i=0; i<array1.length/2; i++) {
			int f = i;
			int p = (array1.length-i) -1;
			
			int temp = array1[f];
			array1[f] = array1[p];
			array1[p] = temp;
		}
		
		System.out.println(Arrays.toString(array1));
	}
}
