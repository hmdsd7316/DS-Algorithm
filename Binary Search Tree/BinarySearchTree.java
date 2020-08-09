class Node{
	int data;
	Node left;
	Node right;

	public Node(int data){
		this.data = data;
	}
}

public class BinarySearchTree{
	Node rootNode;
	
	public void display(){
		display(rootNode);
	}
	
	private void display(Node node){
		if(node == null)
			return;
		
		display(node.left);
		System.out.println(node.data);
		display(node.right);
	}

	public void insert(int data){
		Node node = new Node(data);
		if(rootNode == null){
			this.rootNode = node;
		}else{
			insertRecursiver(rootNode, node);
		}
	}
	
	private void insertRecursiver(Node rootNode, Node node){
		if(node.data < rootNode.data){
			if(rootNode.left == null){
				rootNode.left = node;
			}else{
				insertRecursiver(rootNode.left, node);
			}
		}else{
			if(rootNode.right == null){
				rootNode.right = node;
			}else{
				insertRecursiver(rootNode.right, node);
			}
		}
	}
	
	public static void main(String...a){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(40);
		bst.insert(15);
		bst.insert(30);
		bst.insert(12);
		
		bst.display();
	}
}