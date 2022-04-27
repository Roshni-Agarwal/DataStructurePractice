package linklistDemo;

import java.util.Scanner;

public class LinkedListDemo2 {
	 static Node head;

	    static class Node {
	        int data;
	        Node next;

	        Node(int n) {
	            data = n;
	            next = null;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        head = null;
	        if (n > 0) {
	            head = new Node(s.nextInt());
	            Node temp = head;
	            for (int i = 1; i < n; i++) {
	                temp.next = new Node(s.nextInt());
	                temp = temp.next;
	            }
	        }
	        int index = s.nextInt();
	        deleteNodeAtGivenIndex(index);
	        while (head != null) {
	        	 System.out.print(head.data + " ");
	             head = head.next;
	         }
	     }
	     // Method to delete the node at the given index of the LinkedList
	     static void deleteNodeAtGivenIndex(int index) {
	         // Write your code here
	         Node t=head;
	         int count=0;
	         if(head==null ){
	             return;
	         }
	         if(index==0) {
	        	 head=head.next;
	        	 return;
	         }
	         else{
	             while(t.next!=null){
	                 if(count==index-1){
	                     break;
	                 }
	                
	                  t=t.next;
	                  count++;
	             }
	         
	             if(t.next==null){
	                 return;
	             }
	             else{
	                 Node temp=t.next;
	                 t.next=t.next.next;
	                 return;
	             }
	         
	     }
	 }

	        

}
