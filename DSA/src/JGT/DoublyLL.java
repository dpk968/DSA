package JGT;


public class DoublyLL {

    Node head;
    Node tail;

    void addAtStart(int data){

        Node addPtr = new Node(data);

        if(head==null||tail==null){
            head=tail=addPtr;
            return;
        }

        Node tempHead = head;

        addPtr.next = tempHead;
        tempHead.prev = addPtr;

        head = addPtr;


    }

    void addAtEnd(int data){

        Node addPtr = new Node(data);

        if(head==null||tail==null){
            head=tail=addPtr;
            return;
        }

        Node tempTail = tail;

        tempTail.next = addPtr;
        addPtr.prev = tempTail;

        tail = addPtr;


    }

    void printDLLFromStart(Node head){

        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next; 
        }
        System.out.println();
    }

    void printDLLFromEnd(Node tail){

        Node temp = tail;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.prev; 
        }
        System.out.println();
    }

    void convertIntoTwo(Node head,Node tail){

        Node fastPtr = head;
        Node slowPtr = head;

        Node tailPtr1 = null;
        Node headPtr2 = null;

        while(fastPtr!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next; 
        }

        // 1st ll have head = head and tail = tailPtr2
        headPtr2 = slowPtr;
        tailPtr1 = slowPtr.prev;
        slowPtr.prev.next = null;
        slowPtr.prev = null;

        // 2nd ll have head = headPtr2 and tail = tail
        // headPtr2.next = null;

        System.out.println("1st DLL from head ptr :");
        printDLLFromStart(head);

        System.out.println("1st DLL from tail ptr :");
        printDLLFromEnd(tailPtr1);


        System.out.println("2nd DLL from head ptr :");
        printDLLFromStart(headPtr2);

        System.out.println("1st DLL from tail ptr :");
        printDLLFromEnd(tail);        

    }
    public static void main(String[] args) {


        DoublyLL myDLL = new DoublyLL();
        

        // myDLL.addAtStart(9);
        // myDLL.addAtStart(5);
        // myDLL.addAtStart(8);
        // myDLL.addAtStart(12);
        // myDLL.addAtStart(1);
        // myDLL.addAtStart(10);

        myDLL.addAtEnd(9);
        myDLL.addAtEnd(5);
        myDLL.addAtEnd(8);
        myDLL.addAtEnd(12);
        myDLL.addAtEnd(1);
        myDLL.addAtEnd(10);

        System.out.println("DLL from head ptr :");
        myDLL.printDLLFromStart(myDLL.head);

        System.out.println("DLL from tail ptr :");
        myDLL.printDLLFromEnd(myDLL.tail);
        System.out.println();

        myDLL.convertIntoTwo(myDLL.head,myDLL.tail);

    }

    class Node{
        Node next,prev;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
