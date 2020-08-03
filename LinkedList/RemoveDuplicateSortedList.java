
// Remove duplicate elements from sorted linked list
class RemoveDuplicateSortedList{
	
	public static void main(String...a) throws Exception{
		LinkedList list = new LinkedList();
		list.addFirst("1");
		list.addLast("2");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.addLast("5");
		list.addLast("5");
		list.addLast("5");
		list.addLast("6");
		list.addLast("7");
		list.addLast("8");
		
		list.display();
		list.removeDuplicate();
		list.display();
	}
}