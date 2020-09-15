import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class INTERSECTION {

	// Intersection means common numbers.

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 6, 8, 10, 7 };
		int[] b = { 4, 5, 6, 11, 7, 15, 20 };
//		List<Integer> result = getIntersections(a, b);
		List<Integer> result = getIntersections_core(a, b);

		result.forEach(s -> System.out.println(s));
	}

	// Using Java Data Structure
	private static List<Integer> getIntersections(int arr1[], int arr2[]) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> interSectionElements = new ArrayList<Integer>();
		for (int a : arr1) {
			set.add(a);
		}

		for (int b : arr2) {
			if (set.contains(b)) {
				interSectionElements.add(b);
			}
		}

		return interSectionElements;
	}

	// Most Important without data structure.
	private static List<Integer> getIntersections_core(int arr1[], int arr2[]) {
		// Add interesting elements to this collection
		ArrayList<Integer> intersection = new ArrayList<>();

		int i = 0, j = 0;

		while (i != arr1.length && j != arr2.length) {
			if (arr1[i] == arr2[j]) {
				// If both are equal, add to intersection
				intersection.add(arr1[i]);
				++i;
				++j;
			} else if (arr1[i] > arr2[j]) {
				// Increment index to second array
				++j;
			} else {
				// arr1[i] < arr2[j]
				// Increment index to first array
				++i;
			}
		}

		return intersection;
	}
}
