package LinkedList;

public class DeleteFirstNodeOfSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node head=new Node(10);
	    	head.next=new Node(20);
	    	head.next.next=new Node(30);
	    	printlist(head);
	    	head=delHead(head);
		    printlist(head);

	}
	static Node delHead(Node head) {
		if(head==null) {
			return null;
		}
		else {
			return head.next;
		}
	}
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
	

}
