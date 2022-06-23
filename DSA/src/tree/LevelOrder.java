package tree;

import java.util.LinkedList;
import java.util.Queue;

import tree.bTree.Node;

public class LevelOrder {

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
        
        System.out.println();
        
        System.out.println("Level order traversal : ");
        levelOrder(tree.root);
        
	}

	public static void levelOrder(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
//		q.add(null);
		
		while(!q.isEmpty()) {
			
			Node current = q.poll();
//			if(current==null) {
//				if(q.isEmpty()){
//					return;
//				}else {
//					System.out.println();
//					q.add(null);
//				}
//			}else {
				System.out.print(current.data+" ");
				
				if(current.left!=null)
					q.add(current.left);
				
				if(current.right!=null)
					q.add(current.right);
//			}
			
			
			
		}
		
	}
	

}
