package tree;

import tree.bTree.*;

public class heightOfTree {
    public static void main(String[] args) {

        bTree tree = new bTree();
        tree.add(5);
        tree.add(6);
        
        System.out.println("Height Of Tree : "+getHeight(tree.root));
        
        System.out.print("Inorder Traversal : ");
        bTree.inOrder(tree.root);
    }

	public static int getHeight(Node ptr) {

		if(ptr==null)
			return 0;
		
		return 1 + Math.max(getHeight(ptr.left), getHeight(ptr.right));
		
	}
}
