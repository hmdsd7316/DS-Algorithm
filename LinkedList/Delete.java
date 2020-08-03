public class Delete{

	public static void main(String...a) throws Exception{
		LinkedList linkList = new LinkedList();
		linkList.addFirst("10");
		linkList.addFirst("30");
		linkList.addLast("20");
		linkList.addLast("30");
		linkList.addLast("40");
		linkList.addLast("50");
		linkList.addLast("30");
		linkList.addLast("60");
		linkList.addLast("70");
		linkList.addLast("80");
		linkList.addLast("90");
		linkList.addLast("30");
		linkList.addLast("100");
		linkList.addLast("30");
		
		
		
		linkList.display();
		deleteLastOccurrence(linkList, "10");
		deleteLastOccurrence(linkList, "30");
		deleteLastOccurrence(linkList, "50");
		linkList.display();
	}
	
	/* Delete last occurrence of an item from linked list */
	public static void deleteLastOccurrence(LinkedList linkList, String data){
		Node current = linkList.getHead();
		if(current == null){
			System.out.println("NoElementExists");
			return;
		}

		Node node1 = null;
		Node node2 = null;
		
		if(current.data.equals(data)){
			node1 = current;
			node2 = current;
		}
		
		while(current != null && current.next !=null){
			if(current.next.data.equals(data)){
				node1 = current;
				node2 = current.next;
			}
			current = current.next;
		}
		
		
		if(node1 != null && node2 !=null){
			if(node1 == node2)
				current = node1.next;
			else
				node1.next = node2.next;
		}
		
		
	}
}