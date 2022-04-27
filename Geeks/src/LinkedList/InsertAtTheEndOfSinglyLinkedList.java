package LinkedList;

public class InsertAtTheEndOfSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node head=null;
		    head=insertEnd(head,10);
		    head=insertEnd(head,20);
		    head=insertEnd(head,30);
		    printlist(head);

	}
	static Node insertEnd(Node head, int x) {
		Node temp=new Node(x);
		if(head==null) {
			return temp;
		}
		Node curr=head;
		
			 while(curr.next!=null){
		            curr=curr.next;
		        }
		        curr.next=temp;
		        return head;
		
	}
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }

}
}
