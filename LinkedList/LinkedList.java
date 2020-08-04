public class LinkedList{
	public Node head;
	private Node tail;
	
	public Node getHead(){
		return head;
	}
	
	public Node getTail(){
		return tail;
	}
	
	public void addFirst(String data){
		Node node = new Node(data);
		if(head == null){
			this.head = node;
			this.tail = node;
		}else{
			node.next = head;
			head = node;
		}
	}
	
	public void addLast(String data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			tail = node;
		}else{
			tail.next = node;
			tail = node;
		}
	}
	
	public void addElement(int index, String data) throws Exception{
		Node node = new Node(data);
		if(head == null && index != 0){
			throw new Exception("Invalid Index");
		}
		
		if(head == null){
			head = node;
			tail = node;
		}else{
			Node current = head;
			int count =0;
			
			while(current.next != null){
				if(count == index-1){
					node.next = current.next;
					current.next = node;
					return;
				}else{
					current = current.next;
					count++;
				}
			}
		}
	}
	
	
	public String getFirst() throws Exception{
		if(head == null){
			throw new Exception("NoSuchElementException");
		}else{
			return head.data;
		}
	}
	
	public String getLast() throws Exception{
		if(tail == null){
			throw new Exception("NoSuchElementException");
		}else{
			return tail.data;
		}
	}
	
	public void display() throws Exception{
		if(head == null){
			throw new Exception("NoSuchElementException");
		}else{
			Node current = head;
			System.out.println();
			while(true){
				System.out.print(current.data + " ");
				if(current.next == null){
					break;
				}
				
				current = current.next;
			}
			System.out.println();
		}
	}
	
	
	public String deleteFirst(){
		if(head == null){
			return null;
		}else{
			if(head.next == null){
				String data = head.data;
				head = null;
				tail = null;
				return data;
			}else{
				String data = head.data;
				head = head.next;
				return data;
			}
		}
		
	}
	
	public String deleteLast(){
		if(head == null){
			return null;
		}
		
		if(head.next == null){
				String data = head.data;
				head = null;
				tail = null;
				return data;
		}else{
			Node current = head;
			while(current.next != null){
				if(current.next.next == null){
					String data = current.next.data;
					current.next = null;
					tail = current;
					return data;
				}else{
					current = current.next;
				}
				
			}
		}

		return null;
	}
	
	public String deleteByIndex(int index) throws Exception{
		if(index == 0){
			return deleteFirst();
		}
		
		Node current = head;
		int count = 0;
		while(current.next != null){
			if(count == index-1){
				String data = current.next.data;
				current.next = current.next.next;
				return data;
			}else{
				count++;
				current = current.next;
			}
		}
		throw new Exception("IndexOutOfBoundsException");
	}
	
	public String deleteByValue(String data) throws Exception{
		if(head == null){
			throw new Exception("ElementNotFoundException");
		}
		
		if(head.data.equals(data)){
			deleteFirst();
		}else if(tail.data.equals(data)){
			deleteLast();
		}
		
		Node current = head;
		Node last = head;
		while(current.next !=null){
			if(current.next.data.equals(data)){
				String data1 = current.next.data;
				current.next = current.next.next;
				return data1;
			}else{
				current = current.next;
			}
		}
		
		throw new Exception("ElementNotFoundException");
	}
	
	// Parul -> prem -> Ahmad -> Vineet
	// Parul -> Anika -> prem -> Ahmad -> Vineet
	public static void main(String...a) throws Exception{
		/*LinkedList linkList = new LinkedList();
		linkList.addFirst("2");
		linkList.addFirst("9");
		linkList.addFirst("7");
		linkList.addFirst("5");
		linkList.addFirst("4");
		linkList.display();
		System.out.println("====================");
		*/
		//linkList.deleteByValue("Prem");
		//linkList.deleteByIndex(2);
		
		//linkList.sort();
		//linkList.display();
		
		//System.out.println("Delete Last: " + linkList.deleteLast());
		//System.out.println("Last: " + linkList.getLast());
		
		//System.out.println("First: " + linkList.getFirst());
		//System.out.println("Last: " + linkList.getLast());
		
		//linkList.addLast("Vineet");
		//System.out.println("New Last: " + linkList.getLast());
		
		//linkList.addElement(1, "Anika");
		//System.out.println("");
		//linkList.display();
		
		//linkList.deleteByIndex(22);
		
		
		// Remove Duplicates From Sorted Linked List
		LinkedList linkList = new LinkedList();
		linkList.addFirst("1");
		linkList.addLast("2");
		linkList.addLast("2");
		linkList.addLast("3");
		linkList.addLast("4");
		linkList.addLast("5");
		linkList.addLast("5");
		linkList.addLast("5");
		linkList.addLast("6");
		linkList.addLast("7");
		linkList.addLast("8");
		linkList.display();
		System.out.println("----------");
		linkList.removeDuplicate();
		linkList.display();
	}
	
	public void sort() throws Exception{
		if(head == null){
			throw new Exception("NoElementFount");
		}
		
		if(head.next == null){
			return;
		}
		
		Node index = null;
		Node current = head;
		while(current.next != null){
			index = current;
			while(index.next !=null){
				int data1 = Integer.parseInt(current.data);
				int data2 = Integer.parseInt(index.next.data);
				if(data1 > data2){
					String temp = current.data;
					current.data = index.next.data;
					index.next.data = temp;
				}
				
				index = index.next;
			}
			
			current = current.next;
		}
	}
	
	/* Remove duplicate elements from sorted linked list */
	public void removeDuplicate(){
		
		Node current = head;
		while(current!=null){
			Node temp = current;
			while(temp != null && current.data == temp.data){
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;
		}
	}
}

class Node{
	
	String data;
	Node next;
	
	public Node(String data){
		this.data = data;
	}
}