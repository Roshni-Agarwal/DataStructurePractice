package LinkedList;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printlist(head);

	}
	public static void printlist(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr= curr.next;
		}
	}

}
