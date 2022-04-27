package Dequeue;

import java.util.ArrayDeque;

public class ArrayDequeueAsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating empty ArrayDeque as Queue
        ArrayDeque<Integer> ad  = new ArrayDeque<Integer>();

        // Add items to the ad using offer() at last
        ad.offer(10);
        ad.offer(20);
        
        // Returns the front of queue, 10
        System.out.println(ad.peek());
        
        // Returns and Removes the front of queue, 10
        System.out.println(ad.poll());
        
        // Returns the front of queue, 20
        System.out.println(ad.peek());
        
        // Adds 40 to last of queue
        ad.offer(40);
        
        // Returns the front of queue, 20
        System.out.println(ad.peek());

	}

}
