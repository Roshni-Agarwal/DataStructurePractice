package Queue;

public class Queue1 {
	Node front,rear;
	Queue1(){
		front=rear=null;
	}
	
	void enqueue(int x) {
		Node temp=new Node(x);
		if(front==null) {
			front=rear=temp; 
			return;
		}
		
		rear.next=temp;
		rear=temp;
	}
	
	void dequeue() {
		if(front==null) {
			return;
			
		}
		front=front.next;
		
		if(front==null) {
			rear=null;
		}
	}

}
