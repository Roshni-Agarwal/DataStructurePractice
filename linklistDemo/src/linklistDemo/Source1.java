package linklistDemo;

import java.util.Scanner;

public class Source1 {

	static Node headNode;

	   /* Structure of the node of linked list */
	   static class Node {

	       /* data of the node*/
	       int data;

	       /* This is used to point the next node of
	       the currNode node */
	       Node next;

	       Node(int value) {
	           data = value;
	           next = null;
	       }
	   }

	   /* This method does the following:
	   1. If there is a loop in the linked list, it should print 'Yes'
	   and remove the loop in the linked list and return the head node.
	   2. If there is no loop in the linked list, it should print 'No'
	   and return the head node of the linked list. */
	   Node removeLoop(Node head) {

	       // Write your code here
	  Node slowMv = head;
	        Node fastMv = head;
	        while (slowMv != null && fastMv != null && fastMv.next != null) {
	            slowMv = slowMv.next;
	            fastMv = fastMv.next.next;
	            if(slowMv == fastMv) {
	                System.out.println("Yes");
	                breakLoop(slowMv, head);
	                return head;
	            }
	            
	            
	        }
	        System.out.println("No");
	        return head;
	 
	   }
	   public void breakLoop(Node loop, Node head) {
		   
	        Node p1 = loop;
	        Node p2 = loop;
	        int count=1;
	        // count number of nodes on the loop
	        while(p1.next != p2) {
	            p1 = p1.next;
	            count++;
	        }
	        // fix the pointer to head
	        p1 = head;
	        // another point is K nodes after head
	        p2 = head;
	        for(int i=0;i<count;i++) {
	            p2 = p2.next;
	        }
	        // move both pointers at same pace so that they meet at loop starting node
	        while (p1 != p2) {
	            p1 = p1.next;
	            p2 = p2.next;
	        }
	        // get pointer to the last node
	        while(p2.next != p1) {
	            p2 = p2.next;
	        }
	        // set the last node next value to null
	        p2.next = null;
	    } 
	   /* This method adds a new node with data 'newData' to
	   the front of the linked list*/
	   public void addAtHead(int newData) {

	       /* Create a new Node of data newData */
	       Node newNode = new Node(newData);

	       /* Now, set the next of the newNode as headNode */
	       newNode.next = headNode;

	       /* Next, make this newNode as head*/
	       headNode = newNode;
	   }


	   /* This method prints every node of the linked list from the head,
	   separating by a space */
	   void printLinkedList(Node head) {
	       Node tempNode = head;
	       while (tempNode != null) {
	           System.out.print(tempNode.data + " ");
	           tempNode = tempNode.next;
	       }
	   }
	   // Driver program to test above functions
	   public static void main(String[] args) {
	       Source1 list = new Source1();

	       Scanner in = new Scanner(System.in);

	       /* Get the number of nodes of the linked list from input */
	       int n = in.nextInt();

	       /* Get all nodes of the linked list from input */
	       for (int i = 0; i < n; i++) {
	           list.addAtHead(in.nextInt());
	       }

	       /* Get the value of k from input */
	       int k = in.nextInt();

	       /* Creating a loop, by making the next node of the last node
	        as the kth node from the head of the linked list */
	       if (k != 0) {
	           Node first = headNode, last;
	           for (int i = 0; i < k; i++) {
	               first = first.next;
	           }
	           last = first;
	           while (last.next != null) {
	               last = last.next;
	           }
	           last.next = first;
	       }
	       /* Print the linked list after removing the loop */
	       list.printLinkedList(list.removeLoop(headNode));
	   }

}
