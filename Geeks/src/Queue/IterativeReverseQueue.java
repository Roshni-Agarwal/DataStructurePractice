package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeReverseQueue {
	
	static Queue<Integer> queue; 

	
	static void Print() 
	{ 
		for(Integer x: queue)
		    System.out.print(x + " ");
	} 

	
	static void reversequeue() 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		while (!queue.isEmpty()) { 
			stack.add(queue.peek()); 
			queue.remove(); 
		} 
		while (!stack.isEmpty()) { 
			queue.add(stack.peek()); 
			stack.pop(); 
		} 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue = new LinkedList<Integer>(); 
		queue.add(12); 
		queue.add(5); 
		queue.add(15); 
		queue.add(20); 
	
		reversequeue(); 
		Print(); 

	}

}
