package Queue;

public class ImplementationOfQueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 q = new Queue1(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Queue Front : " + q.front.data); 
		System.out.println("Queue Rear : " + q.rear.data); 

	}

}
