package tree;

import tree.bTree.Node;

public class KthSmallestAndLargest {
	
	static int count = 0;

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
		
		System.out.println();
		int k = 1;
		System.out.print(k+"th smallest element : ");
		KthSmallest(tree.root,k,count);
		
		System.out.println();
		
		System.out.print(k+"th largest element : ");
		count = 0;
		Kthlargest(tree.root,k,count);
		
	}

	public static void KthSmallest(Node root, int k, int count2) {
		
		if(root == null) return ;
				
		KthSmallest(root.left,k,count2);
		count++;

		if(count == k)
			System.out.print(root.data);
		
		KthSmallest(root.right,k,count2);
		
	}
	
	public static void Kthlargest(Node root, int k, int count2) {
		int sizw = getSize(root);
		int largest = sizw-k+1;
		KthSmallest(root,largest,count2);
	}

	
	public static int getSize(Node ptr) {
	
		if(ptr==null)
			return 0;
		return 1 + getSize(ptr.left) + getSize(ptr.right);
		
	}

	

}
