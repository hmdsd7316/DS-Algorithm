// Binary Tree Traversing: Pre-Order Traversal
public class PreOrder{

	public static void main(String...args){
		Node root = new Node();
		root.value = "3";
		
		Node left = new Node();
		left.value = "2";

		Node right = new Node();
		right.value = "1";
		
		root.left = left;
		root.right = right;
		PreOrder preOrder = new PreOrder();
		preOrder.print(root);
	}

	public void print(Node root){
		if(root != null){
			System.out.println("Value: " + root.value);
			print(root.left);
			print(root.right);
		}
	}
}


class Node{
	String value;
	Node left;
	Node right;
}