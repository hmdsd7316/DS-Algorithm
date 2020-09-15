package string;

import java.util.HashSet;
import java.util.Set;

public class IS_TWO_STRING_ANAGRAMS {
	static String value1 = "silent";
	static String value2 = "listen";

	public static void main(String... a) {

		/** Using HashSet */
		if (value1.length() != value2.length()) {
			System.out.println("Not Anagram");
			return;
		}

		Set<Character> set = new HashSet<>();
		for (int i = 0; i < value1.length(); i++) {
			set.add(value1.charAt(i));
		}

		boolean isAnagram = true;
		for (int i = 0; i < value2.length(); i++) {
			if (!set.contains(value2.charAt(i))) {
				isAnagram = false;
				System.out.println("Not Anagram");
				break;
			}
		}

		if (isAnagram) {
			System.out.println("Yes Anagaram");
		}

		/**
		 * add the ASCII value of 1 array. same as add the ASCII value of 2nd array and
		 * check if the equal.
		 */
		System.out.println("=============== Using ASCII count");
		int x1 = 0;
		int x2 = 0;
		for (int i = 0; i < value1.length(); i++) {
			x1 += (int) value1.charAt(i);
			x2 += (int) value2.charAt(i);
		}

		if (x1 == x2) {
			System.out.println("Yes Anagaram");
		} else {
			System.out.println("No Anagaram");
		}

		/**
		 * Using Array - Sort the both elements, now compare each element, if any not
		 * matched then not anagram
		 */
	}

}
