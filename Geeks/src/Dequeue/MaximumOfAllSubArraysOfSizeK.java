package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfAllSubArraysOfSizeK {
	public static void printMaxK(int arr[],int n,int k) {
		for(int i=0;i<n-k+1;i++) {
			int mx=arr[i];
			for(int j=i+1;j<k+i;j++) {
				mx=Math.max(arr[j], mx);
			}
			System.out.println(mx);
		}
	}
	
	public static void printMax(int arr[],int n,int k) {
		Deque<Integer> dq=new LinkedList<Integer>();
		for(int i=0;i<k;i++) {
			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}

        for (int i=k; i < n; ++i) {
            
            System.out.print(arr[dq.peek()] + " ");

            
            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();

           
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();

           
            dq.addLast(i);
        }

        
        System.out.print(arr[dq.peek()]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 40, 30, 10, 60};
        int k = 3;
        printMaxK(arr, arr.length, k);
        printMax(arr, arr.length, k);
	}

}
