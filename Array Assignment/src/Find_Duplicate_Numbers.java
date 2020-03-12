
/** Find duplicate/repeating numbers on the Integer array in Java? */
public class Find_Duplicate_Numbers {
	static int[] array = new int[] { 9, 2, 5, 1, 8, 4, 3, 5, 4, 1, 7, 6 };

	public static void main(String[] args) {
		System.out.println("Method 1");
		Method_1();

		System.out.println("Method 2");
		Method_2();

		System.out.println("Method 3");
		Method_3();
	}

	/**
	 * Pick an element and check only the previous elements. If any matches then
	 * founded the duplicate.
	 */

	private static void Method_1() {
		int[] duplicates = new int[array.length];
		int count = 0;

		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[i] == array[j]) {
					duplicates[count] = array[i];
					count++;
				}
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(duplicates[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Pick an element and check only the next elements. If any matches then founded
	 * the duplicate.
	 */
	private static void Method_2() {
		int[] duplicates = new int[array.length];
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					duplicates[count] = array[i];
					count++;
				}
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(duplicates[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Find duplicates in single iteration. Create new empty array size od the
	 * original array.
	 */
	private static void Method_3() {
		int count[] = new int[array.length];
		int i;

		System.out.println("Repeated elements are : ");
		for (i = 0; i < array.length; i++) {
			if (count[array[i]] == 1)
				System.out.print(array[i] + " ");
			else
				count[array[i]]++;
		}
	}
}
