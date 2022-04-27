package LinkedList;

public class SearchInALinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node head=new Node(10);
	    	head.next=new Node(20);
	    	head.next.next=new Node(30);
	    	printlist(head);
	    	System.out.println("Position of element in Linked List: "+search(head,20));
	    	System.out.println("Position of element in Linked List: "+search1(head,20));

	}
	
	//iterative approach
	private static int search(Node head, int i) {
		// TODO Auto-generated method stub
		int pos=1;
		Node curr=head;
		while(curr!=null) {
			if(curr.data==i) {
				return pos;
			}
			else {
				pos++;
				curr=curr.next;
			}
		}
		return -1;
	}
	
	//recursive approach
	private static int search1(Node head, int i) {
		if(head==null) {
			return -1;
		}
		if(head.data==i) {
			return 1;
		}
		else {
			int res=search(head.next,i);
			if(res==-1) {
				return -1;
			}
			else
			{
				return res+1;
			}
			
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
