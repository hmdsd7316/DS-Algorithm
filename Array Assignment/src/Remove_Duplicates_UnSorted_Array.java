import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_UnSorted_Array {

	static int[] array = new int[] {4, 3, 1, 4, 7, 3, 2, 5, 7};
	
	public static void main(String[] args) {
		int k=0;
		int[] temp = new int[array.length];
		temp[k++] = array[0];
		for(int i=1; i<array.length; i++) {
			boolean isDuplicate = false;
			for(int j=i-1; j >=0; j--) {
				if(array[i] == array[j])
					isDuplicate = true;
			}
			
			if(!isDuplicate) {
				temp[k++] = array[i];
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
		
		// Using HashSet
		Set set = new HashSet();
		for(int num: array) {
			set.add(num);
		}
		
		System.out.println(set.toString());
	}
}
