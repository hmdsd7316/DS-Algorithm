package string;

import java.util.HashMap;
import java.util.Map;

public class FIND_DUPLICATE_CHARS {
	
	/**
	 * Take a HahMap, key=element, value=count
	 * check if element is available, if available increase the count. If not then add count 1.
	 * print duplicate char only once. check if count is two then print, else avoid
	 * */
	
	static String value = "abcdabc";
	
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i< value.length(); i++) {
			
			if(map.containsKey(value.charAt(i))){
				int count = map.get(value.charAt(i));
				map.put(value.charAt(i), ++count);
				
				if(count == 2) {
					System.out.println("duplicate char: " + value.charAt(i));
				}
			}else {
				map.put(value.charAt(i), 1);
			}
		}
	}
}
