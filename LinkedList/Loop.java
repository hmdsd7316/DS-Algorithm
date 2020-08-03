/*
	Detect loop in linked list
	Remove loop in linked list
*/

import java.util.*;

public class Loop{
	
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
		createLoop(linkList);
		//linkList.display();
		
		System.out.println("isLoopUsingTwoPointer: " + isLoopUsingTwoPointer(linkList));
		System.out.println("isLoopUsingHashing: " + isLoopUsingHashing(linkList));
		
		removeLoop(linkList);
		System.out.println("isLoopUsingTwoPointer: " + isLoopUsingTwoPointer(linkList));
		System.out.println("isLoopUsingHashing: " + isLoopUsingHashing(linkList));
	}
	
	private static void createLoop(LinkedList linkList){
		Node current = linkList.getHead();
		if(current == null){
			System.out.println("NoElementExists");
			return;
		}
		int count =0;
		Node fourthNode = null;
		while(current !=null){
			count++;
			if(count == 3){
				fourthNode = current;
			}
			current = current.next;
		}
		
		linkList.getTail().next = fourthNode;
	}
	
	private static boolean isLoopUsingTwoPointer(LinkedList linkList){
		Node current = linkList.getHead();
		if(current == null){
			System.out.println("NoElementExists");
			return false;
		}
		
		Node slow = current;
		Node fast = current;
		
		while(slow != null && fast != null && fast.next != null){
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean isLoopUsingHashing(LinkedList linkList){
	
		Node current = linkList.getHead();
		if(current == null){
			System.out.println("NoElementExists");
			return false;
		}
	
		Set<Node> set = new HashSet<>();	
		
		while(current != null){
			if(set.contains(current)){
				return true;
			}else{
				set.add(current);
			}
			
			current = current.next;
		}
		
		return false;
	}
	
	private static void removeLoop(LinkedList linkList){
		Node tail = linkList.getTail();
		if(tail == null)
			return;
		
		tail.next = null;
		
	}

}