 package tree;

public class bTree {
 
    Node root;

    public void add(int data){
        root = insertRec(root,data);
    }

    public Node insertRec(Node root, int data) {

        if (root==null) {
            System.out.println(data+" inserted");
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            System.out.println("go to left of "+root.data+" for inserting "+data);
            root.left=insertRec(root.left, data);
        }else{
            System.out.println("go to right of "+root.data+" for inserting "+data);
            root.right=insertRec(root.right, data);
        }
        
        return root;


    }

    public static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

    public class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            left=null;
            right = null;
        }
    }

	
}