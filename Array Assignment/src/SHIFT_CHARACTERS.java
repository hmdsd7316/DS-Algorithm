
public class SHIFT_CHARACTERS {
	public static void main(String[] args) {
		String value = "sky Is Blue!";
		char[] array = value.toCharArray();
		
		for(int i =0; i< array.length; i++) {
			if(array[i] != ' ' && array[i] >=65 && array[i] <= 126) {
				int ch = array[i] + 3;
				System.out.print((char)ch);
			}else {
				System.out.print(array[i]);
			}
		}
		
		System.out.println();
		for(int i=0; i<value.length(); i++) {
			System.out.print((char)(((int)value.charAt(i)) + 3));
		}
	}
}
