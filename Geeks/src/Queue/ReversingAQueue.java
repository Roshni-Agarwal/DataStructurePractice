package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingAQueue {
	
	//recursive code
	public static void reverse(Queue<Integer> q) {
		 if(q.isEmpty())
		        return;
		   
		   int x = q.peek();
		   q.remove();
		   
		   reverse(q);
		   
		   q.add(x);
		  
		        
	}
	static void Print(Queue<Integer> q) 
	{ 
		for(Integer x: q)
		    System.out.print(x + " ");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>(); 
		queue.add(12); 
		queue.add(5); 
		queue.add(15); 
		queue.add(20); 
	
		reverse(queue); 
		Print(queue); 

	}

}