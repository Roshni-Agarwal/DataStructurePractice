package linklistDemo;

public class LinkList {
	
	Node head = null;
	
	
	public void addNode(Node node){
		if(this.head == null) {
			this.head = node;
			return;
		}else {
			Node current = head;
			while( current.next != null) {
				current = current.next;
			}
			current.next = node;
			return;
		}
	}
	
	public void addNode(int el) {
		Node temp = new Node();
		temp.data = el;
		temp.next = null;
		
		addNode(temp);
		System.out.println(temp);
		
	}
	

}
