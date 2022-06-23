package linkedList;

public class cycleInLL {
	
	 Node head;
	
	void makeCycleLL() {
		
		Node first = new Node(2);
		head = first;
		Node second = new Node(3);
		Node third = new Node(5);
		Node fourth = new Node(1);
		Node fifth = new Node(32);
		Node six = new Node(16);
		Node seventh = new Node(9);
		Node eight = new Node(8);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next = seventh;
		seventh.next = eight;
		
		// circular link
		eight.next = third;
		
		
		
	}
	
	void toPrint() {
		Node temp = head;
		
		if(temp==null) {
			System.out.println("Sorry nothing to print");
			return;
		}
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	Node containCycle() {
		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr==fastPtr) {
				System.out.println("Given ll contain Cycle");
				return slowPtr;
			}
		}
		System.out.println("Given ll not contain Cycle");
		return null;
	}

	int containCycleAtNode(){

		Node ptr = head;
		Node cycleNode = containCycle();

		while (ptr!=cycleNode) {
			ptr = ptr.next;
			cycleNode = cycleNode.next;
		}

		return ptr.data;
	}

	public static void main(String[] args) {
		
		cycleInLL cll = new cycleInLL();
		cll.makeCycleLL();
//		System.out.println(cll.head.data);
//		cll.toPrint();
		System.out.println(cll.containCycleAtNode());

	}
	
	
	
	
	static class Node{
		int data;
		Node next;
		
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
