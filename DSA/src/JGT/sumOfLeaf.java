package JGT;

public class sumOfLeaf {

    Node root;

    void createTree(){

        
        Node first = new Node(15);
        Node second = new Node(10);
        Node third = new Node(5);
        Node fourth = new Node(6);
        Node fifth = new Node(4);
        Node sixth = new Node(3);

        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;

        root = first;
        

    }

    void printLeafNode(Node ptr){
        if(ptr==null){
            return;
        }

        if(ptr.left==null && ptr.right==null){
            System.out.println("Node data: "+ptr.data);
            return;
        }
        else{
            printLeafNode(ptr.left);
            printLeafNode(ptr.right);
            return;
        }

        
        
    }
    int sumOfLeafNode(Node ptr){
        if(ptr==null){
            return 0;
        }

        if(ptr.left==null && ptr.right==null){
            return ptr.data;
        }
        else{
            return sumOfLeafNode(ptr.left) + sumOfLeafNode(ptr.right);
        }
    }
    public static void main(String[] args) {

        // System.out.println("Hello");
        System.out.println();

        sumOfLeaf tree = new sumOfLeaf();
        tree.createTree();

        tree.printLeafNode(tree.root);

        System.out.println("Sum of Leaf Node :"+tree.sumOfLeafNode(tree.root));

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
