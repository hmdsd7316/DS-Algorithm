public class PrintMedian{
	
	public static void main(String...a) throws Exception{
		LinkedList linkList = new LinkedList();
		linkList.addFirst("10");
		linkList.addLast("20");
		linkList.addLast("30");
		linkList.addLast("40");
		linkList.addLast("50");
		linkList.addLast("60");
		linkList.addLast("70");
		linkList.addLast("80");
		linkList.addLast("90");
		linkList.addLast("100");
		
		linkList.display();
		printMedian(linkList);
		
	}
	
	private static void printMedian(LinkedList linkList){
		Node head = linkList.getHead();
		if(head == null){
			System.out.println("NoElementExist");
			return;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(slow != null && fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Median: " + slow.data);
	}

}