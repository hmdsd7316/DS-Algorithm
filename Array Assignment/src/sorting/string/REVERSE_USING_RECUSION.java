package string;

public class REVERSE_USING_RECUSION {

	static int count = 0;
	public static void main(String[] args) {
		
		String value = "ahmad";
		reverse(value);
	}
	
	static void reverse(String value) {
		if(count != value.length()-1) {
			++count;
			reverse(value);
		}
		
		System.out.print(value.charAt(count) + " ");
		--count;
	}
}
