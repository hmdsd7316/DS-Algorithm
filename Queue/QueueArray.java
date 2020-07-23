/*
Queue Using Array
Fixed Size Array So take input from user.
enqueue: is simiral like stack, at the end it will insert
dequeue: the first element will remove means the arry will shift and then index will decrease
isFull
isEmpty
size();
display()

10, 20, 30, 40, 50
*/

public class QueueArray{
	
	int index = -1;
	int capacity;
	int[] array;
	
	public QueueArray(int capacity){
		this.capacity = capacity;
		this.array = new int[capacity];
	}
	
	public void enqueue(int data) throws Exception{
		if(index == (capacity-1)){
			throw new Exception("OVERFLOW");
		}
		
		index++;
		array[index] = data;
	}
	
	public int dequeue() throws Exception{
		
		if(index < 0)
			throw new Exception("UNDERFLOW");
		
		int data = array[0];
		for(int i=0; i < index; i++){
			array[i] = array[i+1];
		}
		
		index--;
		
		return data;
	}
	
	public int peak() throws Exception{
		if(index < 0)
			throw new Exception("UNDERFLOW");
		
		return array[index];
	}
	
	public void display(){
		if(index < 0)
			return;
		
		System.out.println("==============");
		for(int i=0; i<=index; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("==============");
	}
	
	public static void main(String...a) throws Exception{
		
		QueueArray queue = new QueueArray(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.display();
		
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());

		queue.display();
		
		System.out.println("Peak: " + queue.peak());
	}
}