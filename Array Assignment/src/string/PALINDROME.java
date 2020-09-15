package string;

public class PALINDROME {
	
	public static void main(String[] args) {
		System.out.println("Nitin: " + isPalindrome("NitiN"));
		System.out.println("redivider: " + isPalindrome("redivider"));
		System.out.println("deified: " + isPalindrome("deified"));
		System.out.println("civic: " + isPalindrome("civic"));
		System.out.println("radar: " + isPalindrome("radar"));
		System.out.println("level: " + isPalindrome("level"));
		System.out.println("rotor: " + isPalindrome("rotor"));
		System.out.println("ana: " + isPalindrome("ana"));
		System.out.println("aa: " + isPalindrome("aa"));
		System.out.println("aadfdshf: " + isPalindrome("aadfdshf"));
		System.out.println("a: " + isPalindrome("a"));
	}
	
	static boolean isPalindrome(String value) {
		if(value.length() <2)
			return false;
		
		
		for(int i=0; i< value.length(); i++) {
			if(value.charAt(i) != value.charAt((value.length()-1) - i)) {
				return false;
			}
		}
		return true;
	}
}
