package LinkedList;

public class InsertAtGivenPositionInSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=2;
		int data=20;
		 Node head=new Node(10);
	    	head.next=new Node(30);
	    	head.next.next=new Node(40);
	    	printlist(head);
	    	head=insertPos(head,pos,data);
		    printlist(head);

	}
	private static Node insertPos(Node head, int pos, int data) {
		// TODO Auto-generated method stub
		Node temp=new Node(data);
		
		if(pos==1) {
			temp.next=head;
			return temp;
		}
		
		Node curr=head;
		for(int i=1;i<pos-1 && curr!=null;i++) {
			curr=curr.next;
			
		}
		if(curr==null) {
			return head;
		}
		temp.next=curr.next;
		curr.next=temp;
		
		
		return head;
	}
	public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }

}
