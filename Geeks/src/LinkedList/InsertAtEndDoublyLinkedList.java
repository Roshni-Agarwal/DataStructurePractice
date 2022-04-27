package LinkedList;

public class InsertAtEndDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 Node head=new Node(10);
			    	Node temp1=new Node(20);
			    	Node temp2=new Node(30);
			    	head.next=temp1;
			    	temp1.prev=head;
			    	temp1.next=temp2;
			    	temp2.prev=temp1;
			    	head=insertEnd(head,5);
			    	printlist(head);

	}
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    } 
	static Node insertEnd(Node head,int data) {
		Node temp=new Node(data);
		Node curr=head;
		if(head==null) {
			return temp;
		}
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;
		temp.prev=curr;
		return head;
	}

}
