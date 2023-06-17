package samplepackage;
public class Practice {

	public static void main(String[] args) {
		BinaryTree1 tree = new BinaryTree1();
		  
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
		System.out.println("Height of tree is "+ tree.maxDepth(tree.root));
	}

}

class BinaryTree1 {
	Node root;
	int maxDepth(Node node) {
		if (node == null) {
			return 0;
		}
		int lDepth = maxDepth(node.left);
		int rDepth = maxDepth(node.right);
		
		return lDepth > rDepth ? lDepth + 1 : rDepth + 1;
	}
}
