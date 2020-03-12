public class Stack{
	
	public final int MAX = 100;
	int[] stackArray = new int[MAX];
	public int top;
	
	Stack(){
		// Make Stack Empty
		top = -1;
	}
	
	boolean isEmpty(){
		// If -1 means empty
		return (top < 0);
	}
	
	boolean isStackFull(){
		// if topIndex is reached max limit
		return (top >= (MAX -1));
	}
	
	boolean push(int x){
		if(isStackFull()){
			System.out.println("Stack is full/stackoverflow");
			return false;
		}
		
		// In first time make it 1 and increase++
		stackArray [++top] = x;
		return true;
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty/underflow.");
			return 0;
		}
		
		
		// return the last element and then decrease the index.
		int x = stackArray[top--];
		return x;
	}
	
	public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
		
		// Print Stack.
		System.out.println("Stack is now: ");
		for(int i=0; i<=s.top; i++){
			if(s.stackArray[i] == 0){
				break;
			}
			
			System.out.print(s.stackArray[i] + ", ");
		}
    } 
}