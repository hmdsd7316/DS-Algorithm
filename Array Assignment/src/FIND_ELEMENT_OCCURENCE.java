import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FIND_ELEMENT_OCCURENCE {

	public static void main(String... a) {
		//1. Find and store the occurrence in the TreeMap
		int[] array = new int[] { 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5 };
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int count = map.get(array[i]);
				map.put(array[i], ++count);
			} else {
				map.put(array[i], 1);
			}
		}
	
		// Create array keys
		Integer keys[] = new Integer[map.size()];
		map.keySet().toArray(keys);
		System.out.println(Arrays.toString(keys));
		
		// create array of occurrence/values
		Integer[] values = new Integer[map.size()];
		map.values().toArray(values);
		System.out.println(Arrays.toString(values));
		
		// Sort the key and value array according to the given scenario
		// In this print highest occurrence first, if occurrence is same then print the lowest number first
		for(int i=0; i<keys.length; i++) {
			int index = i;
			
			for(int j=i+1; j<keys.length; j++) {
				if(values[i] < values[j]) {
					index = j;
				}else if(values[i] == values[j] && keys[i] > keys[j]) {
					index = j;
				}
			}
			
			// Swap key and value array both
			int temp = keys[i];
			keys[i] = keys[index];
			keys[index] = temp;
			
			temp = values[i];
			values[i] = values[index];
			values[index] = temp;
			
		}
		
		//  Finally print the occurrence.
		System.out.println();
		for(int i=0; i< keys.length; i++) {
			for(int j=0; j< values[i]; j++) {
				System.out.print(keys[i] + " ");
			}
		}
	}
}
