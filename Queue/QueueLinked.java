/*
Queue Using Linked List

FIFO
Linked List - First, Second, Third
	Add: at last and remove from from first
			If singular linked list then need to iterate to remove last element or can use doubly linked list.

functions
	enqueue
	dequeue
*/

import java.util.*;
public class QueueLinked{
	
	LinkedList<String> linkedList;
	
	public QueueLinked(){
		linkedList = new LinkedList<>();
	}
	
	public void enqueue(String data){
		this.linkedList.addLast(data);
	}
	
	public String dequeue() throws Exception{
		if(this.linkedList.size() == 0)
			throw new Exception("UNDERFLOW");
		
		String data = this.linkedList.getFirst();
		this.linkedList.removeFirst();
		return data;
	}
	
	public void display(){
		System.out.println("==============");
		
		for(String data: this.linkedList){
			System.out.print(data + " ");
		}
		
		System.out.println("==============");
		
	}
	
	public static void main(String...a) throws Exception{
		
		QueueLinked queue = new QueueLinked();
		queue.enqueue("10");
		queue.enqueue("20");
		queue.enqueue("30");
		queue.enqueue("40");
		queue.enqueue("50");
		
		queue.display();
		
		System.out.println("Deque: " + queue.dequeue());
		System.out.println("Deque: " + queue.dequeue());
		System.out.println("Deque: " + queue.dequeue());
		
		queue.display();
		
	}
}

