/*
// Way 2: LinkedList

// Way 1: Array
 1. Take size of the stack => 10
 2. Create array of that size => 10,20,30,0,0,0,0,0,0,0
 3. create pointer variable and increase every time you push
		and decrease everytime you pop
		
 4. Validation => Edge Case
	isFull
	isEmpty*/
	
	
public class StackArray{
	
	int index = -1;
	int size;
	int array[];

	public StackArray(int size){
		this.size = size;
		this.array = new int[size];
	}
	
	public void push(int data) throws Exception{
		if(isFull()){
			throw new Exception("OVERFLOW");
		}
		
		index++;
		array[index] = data;
	}
	
	public int pop() throws Exception{
		
		if(isEmpty()){
			throw new Exception("UNDERFLOW");
		}
	
		int data = array[index];
		index--;
		return data;
	}
	
	public int peak(){
		return array[index];
	}
	
	public boolean isEmpty(){
		return index == -1;
	}
	
	public boolean isFull(){
		return index == (this.size - 1);
	}

	public void display(){
		if(isEmpty())
			return;
		
		System.out.println("=================");
		for(int i=0; i<=index; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("=================");
	}
	
	public static void main(String...a) throws Exception{
		StackArray stack = new StackArray(10);
		System.out.println("isEmpty: " + stack.isEmpty());
		System.out.println("isFull: " + stack.isFull());
		
		//stack.pop();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.display();
		
		System.out.println("pop: " + stack.pop());
		
		stack.display();
		
		System.out.println("peak: " + stack.peak());
		stack.display();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
	}
}
