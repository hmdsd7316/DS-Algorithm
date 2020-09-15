package string;

public class REMOVE_DUPLICATE_CHARS {
	public static void main(String[] args) {
		System.out.println("acbac: " + getUnique("acbac"));
		System.out.println("aaac: " + getUnique("aaac"));
		System.out.println("ababac: " + getUnique("ababac"));
		System.out.println("bbbbd: " + getUnique("bbbbd"));
	}

	static String getUnique(String value) {
		String newString = "";

		for (int i = 0; i < value.length(); i++) {
			if (!newString.contains("" + value.charAt(i))) {
				newString += value.charAt(i);
			}
		}

		return newString;
	}
}
