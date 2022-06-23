package tree;

import java.util.LinkedList;
import java.util.Queue;

import tree.bTree.Node;

public class rightView {

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

        
        
        printRightViewOfTree(tree.root);
	}
	
public static void printRightViewOfTree(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node current = q.poll();
				System.out.print(current.data+" ");
				
				if(current.right!=null)
					q.add(current.right);
				
				else if(current.left!=null)
					q.add(current.left);	
				else
					break;
		}
		
	}

}
