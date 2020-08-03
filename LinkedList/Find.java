import java.util.*;

public class Find{


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
		
		System.out.println("Index 2: " + findNthFromLast(linkList, 2));
		System.out.println("Index 9: " + findNthFromLast(linkList, 9));
		System.out.println("Index 15: " + findNthFromLast(linkList, 15));
		
		
	}
	
	/** Find nth node from the end of linked list */
	private static String findNthFromLast(LinkedList linkList, int index){
		Node current = linkList.getHead();
		if(current == null){
			System.out.println("NoElementExists");
			return null;
		}
		
		Map<Integer, String> map = new HashMap<>();
		int count = 0;
		while (current != null){
			map.put(++count, current.data);
			current = current.next;
		}
		
		if(index > count){
			System.out.println("InvalidIndex");
			return null;
		}
		
		int nodeIndex = (count - index) + 1;
		
		return map.get(nodeIndex);
	}
}