package Queue;

public class ImplementaionOfQueueUsingArray {
	
	int[] arr;
	int front,cap,size, rear;
	
	ImplementaionOfQueueUsingArray(int c){
		arr=new int[c];
		front=0;
		size=0;
		this.cap=c;
		rear = c - 1;
		
	}
	
	boolean isFull(ImplementaionOfQueueUsingArray queue) {
		return (queue.size == queue.cap);
	}
	
	boolean isEmpty(ImplementaionOfQueueUsingArray queue) {
		return (queue.size==queue.cap);
	}
	
	void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		
		else {
			this.rear=(this.rear + 1) 
					% this.cap; 
		this.arr[this.rear] = item; 
		this.size = this.size + 1; 
		System.out.println(item 
						+ " enqueued to queue"); 
		}
	}
	
	
	int dequeue() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		int item = this.arr[this.front]; 
		this.front = (this.front + 1) 
					% this.cap; 
		this.size = this.size - 1; 
		return item; 
	} 
	
	int front() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return this.arr[this.front]; 
	} 

	
	int rear() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return this.arr[this.rear]; 
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementaionOfQueueUsingArray queue = new ImplementaionOfQueueUsingArray(1000); 

		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 

		System.out.println(queue.dequeue() 
						+ " dequeued from queue\n"); 

		System.out.println("Front item is "
						+ queue.front()); 

		System.out.println("Rear item is "
						+ queue.rear()); 

	}

}
