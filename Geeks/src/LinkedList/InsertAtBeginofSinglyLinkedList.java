package LinkedList;

public class InsertAtBeginofSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;
		    head=insertBegin(head,30);
		    head=insertBegin(head,20);
		    head=insertBegin(head,10);
		 printlist(head);

	}
	
	static Node insertBegin(Node head, int x) {
		Node temp=new Node(x);
		temp.next=head;
		return temp;
		
		
	}
	
	public static void printlist(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
