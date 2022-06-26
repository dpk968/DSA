package tree;

import tree.bTree.*;
import java.util.*;


public class leftView {
	


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

        System.out.print("Left view of tree : ");
        
        printLeftViewOfTree(tree.root);
        

	}
	
public static void printLeftViewOfTree(tree.bTree.Node root) {
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node current = q.poll();
				System.out.print(current.data+" ");
				
				if(current.left!=null)
					q.add(current.left);
				
				else if(current.right!=null)
					q.add(current.right);	
				else
					break;
		}
		
	}

}
