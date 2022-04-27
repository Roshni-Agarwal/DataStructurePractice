package linklistDemo;

import linklistDemo.LinkedListDemo2.Node;

public class Mcqsix {
	 Node head;
	 static class Node {
	        int data;
	        Node next;

	        Node(int n) {
	            data = n;
	            next = null;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mcqsix ms=new Mcqsix();
		linklistDemo.Mcqsix.Node head;
		ms.code(null);
		
		
				

	}
	public static void code(Node head) {
		 int value = 0;
		 if (head == null)
		   return;
		 Node temp = head.next;
		 while (temp != head || temp.next != null) {
		   temp = temp.next;
		   value++;
		 }
		 System.out.println(value);
		}

}
