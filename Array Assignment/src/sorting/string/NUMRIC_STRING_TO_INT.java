package string;

public class NUMRIC_STRING_TO_INT {
	
	public static void main(String[] args) {	
		stringToInt("30200");
		stringToInt("14250");
	}
	
	/** We could simply use Integer.parseInt("30200"), but they may ask to avoid using that*/
	
	static void stringToInt(String value) {
		int times = 1;
		int sum = 0;
		
		for(int i=value.length()-1; i>=0; i--) {
			int x = Character.getNumericValue(value.charAt(i));
			sum += (times  * x);
			times = (times * 10);
		}
		
		System.out.println("String: " + value + " = Integer: " + sum);
	}
}
