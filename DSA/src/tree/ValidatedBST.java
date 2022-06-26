package tree;

import tree.bTree.Node;

public class ValidatedBST {

	public static void main(String[] args) {

		bTree tree = new bTree();
		
		tree.add(10);
		tree.add(5);
		tree.add(20);
		tree.add(17);
		tree.add(19);
		
		boolean bstValid =  isBST(tree.root, Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.println(bstValid);
		
		
		bTree.inOrder(tree.root);
		
	}

	public static boolean isBST(Node root, int minValue, int maxValue) {

		if(root == null) return true;
		
		if(root.data >= minValue && root.data <= maxValue) {
			
			boolean left = isBST(root.left,minValue,root.data);
			boolean right = isBST(root.right,root.data,maxValue);
			
			return left && right;
		}
		
		return false;
	}

}
