package tree;

import tree.bTree.*;
public class sizeOfTree {

	public static void main(String[] args) {

		bTree tree = new bTree();
        tree.add(5);
        tree.add(6);
        tree.add(9);
        tree.add(1);
        System.out.println("Size Of Tree : "+getSize(tree.root));
        
        System.out.print("Inorder traversal : ");
        tree.inOrder(tree.root);
        

	}

	

	public static int getSize(Node ptr) {

		if(ptr==null)
			return 0;
		return 1 + getSize(ptr.left) + getSize(ptr.right);
		
	}

}
