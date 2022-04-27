package Dequeue;

import java.util.ArrayDeque;

public class ArrayDequeasDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating empty ArrayDeque as Deque
        ArrayDeque<Integer> ad  = new ArrayDeque<Integer>();

        // Add items to the ad
        ad.offerFirst(10);
        ad.offerLast(20);
        ad.offerFirst(30);
        ad.offerLast(40);
        
        // Returns 30
        System.out.println(ad.peekFirst());
        
        // Returns 40
        System.out.println(ad.peekLast());
        
        // Returns and removes 30
        System.out.println(ad.pollFirst());
        
        // Returns 10
        System.out.println(ad.peekFirst());
        
        // Returns and removes 40
        System.out.println(ad.pollLast());
        
        // Returns 20
        System.out.println(ad.peekLast());

	}

}
