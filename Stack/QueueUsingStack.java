// Queue Using Stack
import java.util.*;
class QueueUsingStack{
	Stack<String> stack = new Stack<>();
	
	
	public static void main(String...a){
		QueueUsingStack queue = new QueueUsingStack();
		queue.enque("10");
		queue.enque("20");
		queue.enque("30");
		queue.enque("40");
		
		System.out.println();
		for(String data: queue.stack){
				System.out.println(data + " ");
		}
		System.out.println();
		
		//queue.deque();
		//queue.deque();
		
		// recursively with single stack.
		queue.dequeRecursive();
		queue.dequeRecursive();
		
		queue.enque("60");
		queue.enque("70");
		
		System.out.println();
		for(String data: queue.stack){
				System.out.println(data + " ");
		}
		System.out.println();
	}
	
	public void enque(String data){
		stack.push(data);
	}
	
	public void deque(){
		Stack<String> stackTemp = new Stack<>();
		while(!stack.isEmpty()){
			stackTemp.push(stack.pop());
		}
		
		stackTemp.pop();
		
		while(!stackTemp.isEmpty()){
			stack.push(stackTemp.pop());
		}
	}
	
	public String dequeRecursive(){
		return res(this.stack);
	}
	
	private String res(Stack<String> stack){
		if(stack.size() == 1)
			return stack.pop();
		
		String data = stack.pop();
		String resData = res(stack);
		stack.push(data);
		return resData;
	}
	
}