// Merge a linked list into another linked list at alternate positions.
/**
Given two linked lists, insert nodes of second list into first list at alternate positions of first list.
For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6, the first list should become 5->12->7->10->17->2->13->4->11->6 and second list should become empty. The nodes of second list should only be inserted when there are positions available. For example, if the first list is 1->2->3 and second list is 4->5->6->7->8, then first list should become 1->4->2->5->3->6 and second list to 7->8.

Use of extra space is not allowed (Not allowed to create additional nodes), i.e., insertion must be done in-place. Expected time complexity is O(n) where n is number of nodes in first list.

*/

public class Merge{

	public static void main(String...a) throws Exception{
		LinkedList linkList1 = new LinkedList();
		LinkedList linkList2 = new LinkedList();
		
		linkList1.addFirst("1");
		linkList1.addLast("2");
		linkList1.addLast("3");
		/*linkList1.addLast("4");
		linkList1.addLast("5");
		linkList1.addLast("6");
		linkList1.addLast("7");
		linkList1.display();
		*/
		linkList2.addFirst("4");
		linkList2.addLast("5");
		linkList2.addLast("6");
		linkList2.addLast("7");
		linkList2.addLast("8");
		linkList2.display();
		
		merge(linkList1, linkList2);
		System.out.println("==================");
		linkList1.display();
		linkList2.display();
		
	}
	
	private static void merge(LinkedList linkList1, LinkedList linkList2){
		
		Node c1 = linkList1.getHead();
		Node c2 = linkList2.getHead();
		
		
		while(c1 != null && c2 !=null){
			Node next = c1.next;
			Node next2 = c2.next;
			c1.next = c2;
			c2.next = next;
			c1 = next;
			c2 = next2;
		}
		
		
		linkList2.head = c2;
		
	}
	
	/** This creates new linked list
	private static LinkedList mergeLinkedList(LinkedList linkList1, LinkedList linkList2){
		LinkedList link = new LinkedList();
		
		Node c1 = linkList1.getHead();
		Node c2 = linkList2.getHead();
		
		while(c1 != null || c2 != null){
			
			if(c1 != null){
				link.addLast(c1.data);
				c1 = c1.next;
			}
			
			if(c2 !=null){
				link.addLast(c2.data);
				c2 = c2.next;
			}
			
		}
		
		return link;
	}*/
}