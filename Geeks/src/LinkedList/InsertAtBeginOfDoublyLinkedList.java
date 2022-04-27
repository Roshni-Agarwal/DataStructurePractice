package LinkedList;

public class InsertAtBeginOfDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node head=new Node(10);
	    	Node temp1=new Node(20);
	    	Node temp2=new Node(30);
	    	head.next=temp1;
	    	temp1.prev=head;
	    	temp1.next=temp2;
	    	temp2.prev=temp1;
	    	head=insertBegin(head,5);
	    	printlist(head);

	}
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    } 
	
	static Node insertBegin(Node head,int data) {
		Node temp=new Node(data);
		temp.next=head;
		if(head!=null) {
			head.prev=temp;
		}
		return temp;
	}

}
