package linkedList;



public class MyLinkedList {
	
	Node head;
	
	void add(int data) {
		Node addNode = new Node(data);
		
		if(head == null) {
			head = addNode;
			return;
		}
		
		Node temp = head;
		while(temp.next!=null)
			temp =temp.next;
		temp.next = addNode;
	}
	
	
	
	
	
	
	public void reverse() {
		// entire ll reverse
		
		head = reverseFrom(head);
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
	
	
	void addNodeAtBegin(int data) {
		
		Node addNode = new Node(data);
		
		if(head == null) {
			head = addNode;
			return;
		}
		
		addNode.next = head;
		head = addNode;
		
		
	}
	
	
	
	
	void addAt(int data, int position) {
		Node temp = head;
		Node addelement = new Node(data);
		
		if(position == 0) {
			addelement.next = head;
			head = addelement;
			return;
			
		}
		
		for(int i=0 ;i<position-1;i++ ) {
			temp=temp.next;
		}
		
		addelement.next = temp.next;
		temp.next = addelement;
		
	}
	
	public boolean checkPalindrome() {
		if(length()==1||head==null) {
			return true;
		}
		if(length()==2) {
			return head.data == head.next.data;
		}
		Node midPtr=midNode();
//		System.out.println("midPtr data "+midPtr.data);
		Node reverseHead = reverseFrom(midPtr.next);
		Node cur = head;
		
		
		
		while(reverseHead!=null) {
			if(reverseHead.data!=cur.data) {
				return false;
			}
			reverseHead = reverseHead.next;
			cur = cur.next;
				
		}
		
		return true;
	}
	
	int midElement() {		
		
		return midNode().data;
	}
	
	public Node midNode() {
		
		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr !=null && fastPtr.next!=null) {
			
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}		
		return slowPtr;
	}
	
	int length() {
		Node temp = head;
	
		if(temp == null) return 0;
		
		int len=1;
		while(temp.next!=null) {
			len++;
			temp=temp.next;
		}
		
		return len;
		
	}
	
	void delete(int data) {
		Node temp = head;
		if(temp == null) {
			System.out.println("First enter an element");
			return;
		}
		if(findElement(data)==0) {
			System.out.println("Element is not present in your ll");
			return;
		}
		if(head.data == data) {
			head = temp.next;
			return;
		}
		for(int i=1;i<findElement(data)-1;i++) temp=temp.next;
//		System.out.println(temp.data);
		
		temp.next = temp.next.next;
			
		
		
	}
	
	void NthNode(int pos) {
		Node temp = head;
		if(temp == null) {
			System.out.println("First enter an element");
			return;
		}
		if(pos>length()) {
			System.out.println("Enter valid range");
			return;
		}
			
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		
		System.out.println(temp.data);
			
		
		
	}
	
	/* 
	  Create a method to Count the numbers of a specific value
	 */
	
	int countNode(int data) {
		
		Node temp = head;
		int count=0;
		while(temp!=null) {
			if(temp.data == data) count++;
				temp=temp.next;
			}
		return count;
	}
	
	int findElement(int data) {
		
		Node temp = head;
		int pos=0;
		boolean found=false;
		while(temp!=null) {
			if(temp.data == data) {
				found = true;
				pos++;
				break;
			}
			else {
				temp=temp.next;
				pos++;
			}
				
		}
		if(found) {
			return pos;
		}
		else {
//			System.out.println("not found");
			return 0;
		}
			
	}
	
	//Find the minimum and maximum element in the linked list.
	int maxValue() {
		Node temp = head;
		int max = temp.data;
		while(temp.next!=null) {
			temp = temp.next;
			if(temp.data>max)
				max = temp.data;
		}
		
		
		return max;
	}
	int minValue() {
		Node temp = head;
		int min = temp.data;
		while(temp.next!=null) {
			temp = temp.next;
			if(temp.data<min)
				min = temp.data;
		}
		
		
		return min;
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

