package tree;

public class LCA {

	public static void main(String[] args) {

		
		bTree tree = new bTree();
		
		tree.add(5);
		tree.add(4);
		tree.add(8);
		tree.add(2);
		tree.add(6);
		tree.add(10);
		tree.add(3);
		tree.add(7);
		
		bTree.inOrder(tree.root);
		
		System.out.println("LCA : ");

		
		
		
	}

}
