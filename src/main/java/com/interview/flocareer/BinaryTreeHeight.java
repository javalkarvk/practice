package com.interview.flocareer;

public class BinaryTreeHeight {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeHeight tree = new BinaryTreeHeight();
		 
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Height of tree is " + tree.getHeight(tree.root));
	}
	
	public int getHeight(Node node) {
		if (null == node) {
			return 0;
		}
		int leftHeight = getHeight(node.left);
		int rightHeight = getHeight(node.right);
		return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
	}

}
