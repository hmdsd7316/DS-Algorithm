import java.util.*; 

public class StackLinked{

	LinkedList<String> linkedList = new LinkedList<>();
	
	public StackLinked(){
		
	}
	
	public void push(String data){
		this.linkedList.addFirst(data);
	}
	
	public String pop() throws Exception{
		
		//if(this.linkedList.size() == 0){
			//throw new Exception("UNDERFLOW");
		//}
		
		String data = this.linkedList.getFirst();
		linkedList.removeFirst();
		return data;
	}
	
	public String peak(){
		return linkedList.getFirst();
	}
	
	public void display(){
		System.out.println("===============");
		for(String data: linkedList){
			System.out.print(data + " ");
		}
		System.out.println("===============");
	}
	
	public static void main(String...a) throws Exception{
		StackLinked stack = new StackLinked();
		
		//stack.pop();
		stack.push("10");
		stack.push("20");
		stack.push("30");
		stack.push("40");
		stack.push("50");
		stack.push("60");
		
		stack.display();
		
		System.out.println("pop: " + stack.pop());
		
		stack.display();
		
		System.out.println("peak: " + stack.peak());
		stack.display();
		
		stack.push("10");
		stack.push("20");
		stack.push("30");
		stack.push("40");
		stack.push("50");
		stack.push("60");
		
	}

}