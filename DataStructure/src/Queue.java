import java.util.Arrays;


/** Most of the program on the Internet can only enqueue and dequeue**/
/** But after dequeue again enqueue is not working properly.*/
/** In this program  front is 0 for whole life cycle.*/
/** When dequeue happens I shift the array */
class Queue {
	int front = 0; 
	int rear = -1;
	int size = 0;
	int capacity = 10;
	int array[];

	public Queue() {
		array = new int[this.capacity];
	}

	// Queue is full when size becomes equal to the capacity
	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return (queue.size == 0);
	}

	// Method to add an item to the queue. It changes rear and size
	void enqueue(int item) {
		if (isFull(this))
			return;
		
		this.rear = (this.rear + 1);
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}

	// Method to remove an item from queue. It changes rear and size
	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.array[this.front];
		this.size = this.size - 1;
		
		for(int i=0; i<=this.rear-1; i++) {
			array[i] = array[i+1];
		}
		--rear;
		return item;
	}

	// Method to get front of queue
	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	// Method to get rear of queue
	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}

	// print only queue element.
	void display() {
		System.out.println();
		for(int i=front; i<=rear; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("After Enque -------------============");
		queue.display();
		System.out.println("Front item is " + queue.front());
		System.out.println("Rear item is " + queue.rear());
		
		System.out.println("After Dequeue ------------============");
		System.out.println(queue.dequeue() + " dequeued from queue");
		System.out.println(queue.dequeue() + " dequeued from queue");
		queue.display();
		System.out.println("Front item is " + queue.front());
		System.out.println("Rear item is " + queue.rear());
		
		
		System.out.println("Again After Enque============");
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.display();
		System.out.println("Front item is " + queue.front());
		System.out.println("Rear item is " + queue.rear());
		
		
		System.out.println("Complete Array =====================================");
		System.out.println(Arrays.toString(queue.array));
	}
}
