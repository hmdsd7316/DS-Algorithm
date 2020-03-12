
public class Kth_Smallest_Largest_No {

	static int[] array = new int[] {7, 10, 4,  3, 20, 15};
	
	public static void main(String[] args) {
		// Find kth Largest No.
		int kthLargest = 3;
		int kCount = 0;
		for(int i=0; i< array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
			kCount++;
			
			if(kCount == kthLargest) {
				System.out.println("kth Largest No: " + array[i]);
				break;
			}
		}
		
		
		// Find kth smallest no:
		int kthSmallest = 3;
		kCount = 0;
		for(int i=0; i< array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
			kCount++;
			
			if(kCount == kthSmallest) {
				System.out.println("kth Smallest No: " + array[i]);
				break;
			}
		}
	}
	
}
