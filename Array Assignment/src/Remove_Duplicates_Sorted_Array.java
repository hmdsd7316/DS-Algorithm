import java.util.Arrays;

public class Remove_Duplicates_Sorted_Array {

	static int[] array = new int[] {1, 2, 2, 3, 4, 4, 4, 5, 5};
	
	public static void main(String[] args) {
		
		int temp[] = new int[array.length];
		int j = 0;
		
		for(int i=0; i < array.length-1; i++) {
			
			if(array[i] != array[i+1]) {
				temp[j++] = array[i];
			}
		}
		
		temp[j++] = array[array.length-1];
		
		for(int i=0; i<j; i++) {
			array[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(array));
	}
}
