package tree;

import tree.bTree.Node;

public class Diameter {

	public static void main(String[] args) {

		bTree tree = new bTree();
		
		tree.add(5);
		tree.add(2);
		tree.add(8);
		tree.add(6);
		tree.add(10);
		
		bTree.inOrder(tree.root);	
		System.out.println();
		
		int diameter = getDiameter(tree.root);
		System.out.println("Diameter : "+diameter);
	}
	
	
	
	public static int getDiameter(Node root) {

		if(root == null) return 0;
		
		return getHeight(root.left) + getHeight(root.right) + 1;
		
	}



	public static int getHeight(Node ptr) {

		if(ptr==null)
			return 0;
		
		return 1 + Math.max(getHeight(ptr.left), getHeight(ptr.right));
		
	}

}
