import java.util.HashMap;
import java.util.Map;

public class Find_Unique_In_Duplicates {
	static int[] array = new int[] { 1,5,6,2,1,6,4,3,2,5,3};
	
	public static void main(String...args) {
		// Brute Force:
		for(int i=0; i<array.length; i++) {
			boolean isDuplicate = false;
			for(int j=0; j<array.length; j++) {
				if(array[i] == array[j] && i!=j) {
					isDuplicate = true;
				}
			}
			
			if(!isDuplicate) {
				System.out.println("Unique: " + array[i]);
				break;
			}
		}
		
		
		// Using HashMap
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<array.length; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			}else {
				map.put(array[i], 1);
			}
		}
		
		for(Integer key: map.keySet()) {
			if(map.get(key) == 1) {
				System.out.println("Unique: " + key);
				break;
			}
		}
	}
}
