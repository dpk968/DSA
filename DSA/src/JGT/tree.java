package JGT;

public class tree {

    Node root;


    void createTree(){

        
        Node first = new Node(15);
        Node second = new Node(10);
        Node third = new Node(5);
        Node fourth = new Node(6);
        Node fifth = new Node(4);
        Node sixth = new Node(5);

        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;

        root = first;
        

    }

    boolean isValidBtree(Node ptr){

        // System.out.println("ek baar aagya");
        if(ptr==null){
            return true;
        }
        
        else if(ptr.left==null && ptr.right==null)
            return true;
        else if(ptr.left==null){
            return ptr.data == ptr.right.data;
        }
        else if(ptr.right==null){
            return ptr.data == ptr.left.data;
        }
        else if((ptr.data == ptr.right.data+ptr.left.data)){
            return isValidBtree(ptr.left) && isValidBtree(ptr.right);
        }
        else
            return false;
    }

    public static void main(String[] args) {
        // System.out.println("hello");

        tree mt = new tree();
        mt.createTree();

        boolean check = mt.isValidBtree(mt.root);

        System.out.println();
        System.out.println("Check parent.data = left.data + right.data :"+check);
    
        System.out.println("\n");

    }


    class Node{
        Node left,right;
        int data;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
