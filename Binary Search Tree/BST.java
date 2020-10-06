import static java.lang.System.out;

public class BST{
    int value;
    BST left, right;

    public BST(int value){
        this.value = value;
    }

    public BST insert(int value){
        if(value < this.value){
            if(this.left == null){
                return this.left = new BST(value);    
            }else{
                return this.left.insert(value);
            }
        }else{
            if(this.right == null){
                return this.right = new BST(value);
            }else{
                return this.right.insert(value);
            }
        }
    }

    public void traverse(){
        if(this.left !=null)
            this.left.traverse();
        
        out.println(this.value);

        if(this.right != null)
            this.right.traverse();
    }

    public boolean contains(int value){
        if(this.value == value)
            return true;

        if(value < this.value && this.left !=null)
            return this.left.contains(value);
        else if(this.right !=null)
            return this.right.contains(value);
        else
            return false;
    }

    public BST getMin(){
        if(this.left == null)
            return this;
        
        return this.left.getMin();
    }

    public BST getMax(){
        if(this.right ==  null)
            return this;

        return this.right.getMax();
    }

    BST delete(int value){
        return deleteRec(this, value);
    }

    BST deleteRec(BST root, int value) {
        // Return if the tree is empty
        if (root == null)
          return root;
    
        // Find the node to be deleted
        if (value < root.value)
          root.left = deleteRec(root.left, value);
        else if (value > root.value)
          root.right = deleteRec(root.right, value);
        else {
          // If the node is with only one child or no child
          if (root.left == null)
            return root.right;
          else if (root.right == null)
            return root.left;
    
          // If the node has two children
          // Place the inorder successor in position of the node to be deleted
          root.value = minValue(root.right);
    
          // Delete the inorder successor
          root.right = deleteRec(root.right, root.value);
        }
    
        return root;
      }
    
      // Find the inorder successor
      int minValue(BST root) {
        int minv = root.value;
        while (root.left != null) {
          minv = root.left.value;
          root = root.left;
        }
        return minv;
      }
	 
	static BST prev;
	private static boolean isBST(BST node){
		if(node == null){
			return true;
		}
		
		if(!isBST(node.left))
			return false;
		
		if(prev !=null && prev.value > node.value)
			return false;
		
		prev = node;
		
		return isBST(node.right);
	}

    public static void main(String...a) {
        BST bst = new BST(50);
		//bst.insert(10);
		//bst.insert(40);
		//bst.insert(15);
		//bst.insert(30);
		//bst.insert(12);
		
		bst.traverse();
        out.println("is 15 Exists: " + bst.contains(15));
        out.println("Min Node is: " + bst.getMin().value);
        out.println("Max Node is: " + bst.getMax().value);

        bst.delete(15);
        out.println(" After delete ================");
        bst.traverse();
		
		out.println("isBST: " + isBST(bst));
    }
}