import java.util.Arrays;
import java.util.stream.IntStream;

public class IS_NUMBER_CONTAINS {
	
	static int[] array = new int[] {2, 5, 3, 1, 6, 9, 4, 7};
	public static void main(String[] args) {
		System.out.println("Using Linear Search...");
		System.out.println("\t Is 1 exists: " + linearSearch(1));
		System.out.println("\t Is 0 exists: " + linearSearch(0));
		
		System.out.println("Using Stream Search...");
		System.out.println("\t Is 1 exists: " + streamSearch(1));
		System.out.println("\t Is 0 exists: " + streamSearch(0));
		
		System.out.println("Using ArraysList...");
		System.out.println("\t Is 1 exists: " + arrayListConatins(1));
		System.out.println("\t Is 0 exists: " + arrayListConatins(0));
		
		System.out.println("Stream for non-premitive");
		streamForReference();
	}
	
	static boolean linearSearch(int number) {
		for(int i=0; i<array.length; i++) {
			if(array[i] == number)
				return true;
		}
		
		return false;
	}
	
	static boolean streamSearch(int number) {		
		return IntStream.of(number).anyMatch(n -> n==number);
	}
	
	/** for this array data type must be Integer(Reference) type. int array type won't work here.*/
	static boolean arrayListConatins(int number) {
		Integer[] array = new Integer[] {2, 5, 3, 1, 6, 9, 4, 7};
		return Arrays.asList(array).contains(number);
	}
	
	static void streamForReference() {
		String[] names = new String[] {"Ahmad", "Sayeed"};
		boolean isMatch = Arrays.stream(names).anyMatch(n-> n.equalsIgnoreCase("babu"));
		System.out.println("\t Is babu exists: " + isMatch);
		
		isMatch = Arrays.stream(names).anyMatch(n-> n.equalsIgnoreCase("ahmad"));
		System.out.println("\t Is ahmad exists: " + isMatch);
	}
}
