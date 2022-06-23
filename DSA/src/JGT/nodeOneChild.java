package JGT;

public class nodeOneChild {

    Node root;

    void createTree(){

        
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node tenth = new Node(10);
        Node eleven= new Node(11);

        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;

        fourth.left = eight;
        
        fifth.left = nine;
        fifth.right = tenth;

        sixth.right=eleven;


        root = first;

    }

    void printOneChildNode(Node ptr){

        if (ptr==null) {
            return;
        }

        if(ptr.left != null && ptr.right==null){
            System.out.print(ptr.data+" ");
            return;
        }else if(ptr.right != null && ptr.left == null){
            System.out.print(ptr.data+" ");
        }else if(ptr.left == null && ptr.right == null){
            return;
        }else{
            printOneChildNode(ptr.left);
            printOneChildNode(ptr.right);
            return;
        }

    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Print node have Only one child :)");

        nodeOneChild tree = new nodeOneChild();
        tree.createTree();

        tree.printOneChildNode(tree.root);

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
