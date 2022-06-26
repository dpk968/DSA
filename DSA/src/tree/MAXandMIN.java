package tree;

import tree.bTree.*;

public class MAXandMIN {

	public static void main(String[] args) {

		bTree tree = new bTree();
        tree.add(5);
        tree.add(6);
        tree.add(9);
        tree.add(8);
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        
        System.out.println("Min value Of Tree : "+getMin(tree.root));
        System.out.println("Max value Of Tree : "+getMax(tree.root));
        
        System.out.print("Inorder traversal : ");
        bTree.inOrder(tree.root);
	}
	
	public static int getMax(Node ptr) {
		
		if(ptr==null)
			return Integer.MIN_VALUE;
		
		return Math.max(ptr.data, Math.max(getMax(ptr.left), getMax(ptr.right)));

	}

	public static int getMin(Node ptr) {
		
		if(ptr==null)
			return Integer.MAX_VALUE;
		
		return Math.min(ptr.data, Math.min(getMin(ptr.left), getMin(ptr.right)));

	}

}
