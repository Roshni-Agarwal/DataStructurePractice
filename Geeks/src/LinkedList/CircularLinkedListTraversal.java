package LinkedList;

public class CircularLinkedListTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node head=new Node(10);
	    	head.next=new Node(5);
	    	head.next.next=new Node(20);
	    	head.next.next.next=new Node(15);
	    	head.next.next.next.next=head;
	    	printlist(head);
	    	System.out.println();
	    	printlist1(head);
	    	

	}
	public static void printlist(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next)
            System.out.print(r.data+" ");
    }
	
	 public static void printlist1(Node head){
	        if(head==null)return;
	        Node r=head;
	        do{
	            System.out.print(r.data+" ");
	            r=r.next;
	        }while(r!=head);
	    }

}
