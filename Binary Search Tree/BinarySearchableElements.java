/*

Binary Searchable Elements
Binary search is a search algorithm usually used on a sorted sequence to quickly find an element with a given value. In this problem we will evaluate how binary search performs on data that isn't necessarily sorted. An element is said to be binary searchable if an element can be found provided the pivot is chosen everytime as the middle element - like in a regular binary search.
We need to find total number of elements which are binary searchable.


Example 1:

[2, 1, 3, 4, 6, 5] - 3 is searchable, 2 is searchable, 1 not searchable, 6 is searchable, 4 is seachable, 5 is not searchable 
Output: 4
Example 2:

Input: [1, 3, 2]
Output: 2
Explanation: 3 and 1 are searchable - you look for 3 - find it in the middle, look for 1 - you search the left half....search for 2, you look for it in the left half but didn't find.

*/
class BinarySearchableElements{
	
	static int count = 0;
	
	public static void main(String...a){
		int[] array = {2, 1, 3, 4, 6, 5};
		countSearchAble(array, 0, array.length-1);
		System.out.println("Searchable: " + (count));
	}
	
	static void countSearchAble(int arr[], int l, int r) 
    { 
        if (l < r) { 
            // Find the middle point 
            int m = (l + r) / 2; 
  
            // first and second halves 
            countSearchAble(arr, l, m); 
            countSearchAble(arr, m + 1, r); 
  		
			if(arr[m] < arr[r] || arr[m] > arr[l]){
				count++;
			}
        } 
    } 
}