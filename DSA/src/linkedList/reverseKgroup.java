package linkedList;

public class reverseKgroup {

    Node reverseKGroup(Node head,int k){

        Node temp = head;
		Node prev = null;
		Node curr = head;

        int count = 1;

        while (k!=count) {

            temp=temp.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
            count++;
            
        }
        prev.next =  reverseKGroup(head,k);
        return null;
    }

    public Node reverseFrom(Node head) {
		Node temp = head;
		Node prev = null;
		Node curr = head;
		while(temp!=null) {
			temp=temp.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		return prev;
		
	}

    public static void main(String[] args) {
        System.out.println("hello");

        MyLinkedList ll = new MyLinkedList();
        ll.add(5);
        ll.add(8);
        ll.add(9);
        ll.add(12);
        ll.add(123);
        ll.add(1);
        ll.toPrint();
        System.out.println();
        System.out.println(ll.head.data);
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
