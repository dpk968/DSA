package tree;

import tree.bTree.Node;

public class convertToDLL {
	
	Node prev = null;
	Node head = null;
	
	void binarySearchToDll(Node root) {
		
		if(root == null) return;
		
		binarySearchToDll(root.left);
		
		if(prev == null) head = root;
		
		
		return ;
	}
	

	public static void main(String[] args) {

		bTree tree = new bTree();
		
		tree.add(10);
		tree.add(5);
		tree.add(20);
		tree.add(17);
		tree.add(19);
		
		bTree.inOrder(tree.root);
		

	}

}
