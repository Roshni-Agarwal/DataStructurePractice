package LinkedList;

public class Recursivetravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		rprintlist(head);

	}
	
	public static void rprintlist(Node head) {
		
		if(head ==null) {
			return;
		}
		System.out.println(head.data);
		rprintlist(head.next);
	}

}
