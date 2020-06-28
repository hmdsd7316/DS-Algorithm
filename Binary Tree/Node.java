class Node{
	Node left, right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
	public static void main(String...a){
		Node node = new Node(10);
		node.insert(5);
		node.insert(8);
		node.insert(15);
		
		node.printInorder();
	}
	
	public void insert(int value){
		if(value <= data){
			if(left == null){
				left = new Node(value);
			}else{
				left.insert(value);
			}
		}else{
			if(right == null){
				right = new Node(value);
			}else{
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value){
		if(value == data){
			return true;
		}else if(value < data){
			if(left == null){
				return false;
			}else{
				return left.contains(value);
			}
		}else{
			if(right == null){
				return false;
			}else{
				return right.contains(value);
			}
		}
	}
	
	public void printInorder(){
		
		if(left != null){
			left.printInorder();
		}
		
		System.out.println(data);
		
		if(right !=null){
			right.printInorder();
		}
	}
}





