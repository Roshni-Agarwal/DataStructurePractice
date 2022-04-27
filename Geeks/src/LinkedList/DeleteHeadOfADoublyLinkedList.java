package LinkedList;

public class DeleteHeadOfADoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=delHead(head);
    	printlist(head);

	}
	
	static Node delHead(Node head) {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return null;
		}
		else {
			head=head.next;
			head.prev=null;
			return head;
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
