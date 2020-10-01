import static java.lang.System.out;
class Node{
	int data;
	Node left, right;

	public Node(int data){
		this.data = data;
	}
}

public class BinarySearchTree{
	Node rootNode;
	
	public void traverse(){
		traverse(rootNode);
	}
	
	private void traverse(Node node){
		if(node == null)
			return;
		
			traverse(node.left);
		System.out.println(node.data);
		traverse(node.right);
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

	public boolean contains(int value){
		return contains(rootNode, value);
	}

	private boolean contains(Node node, int value){
		if(node.data == value){
			return true;
		}

		if(node.left !=null && value < node.data){
			return contains(node.left, value);
		}else if(node.right !=null){
			return contains(node.right, value);
		}

		return false;
	}
	
	public static void main(String...a){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(40);
		bst.insert(15);
		bst.insert(30);
		bst.insert(12);
		
		bst.traverse();
		out.println("is 15 Exists: " + bst.contains(15));
	}
}