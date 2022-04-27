package linklistDemo;

import java.util.Scanner;

public class Dublycircluatlist {
	
	Node head;
    // Creating structure for nodes
    
    static Node start;
    
    class Node {
        //write your code here
         int data; 
    Node next; 
    Node prev; 
    };

    // This method will push the input data at the end of the list
    void push(int data) {
        //write your code here
        if (start == null) 
    { 
        Node new_node = new Node(); 
        new_node.data = data; 
        new_node.next = new_node.prev = new_node; 
        start = new_node; 
        return; 
    } 
        // If list is not empty 
        
        /* Find last node */
        Node last = (start).prev; 
     
        // Create Node dynamically 
        Node new_node = new Node(); 
        new_node.data = data; 
     
        // Start is going to be next of new_node 
        new_node.next = start; 
     
        // Make new node previous of start 
        (start).prev = new_node; 
     
        // Make last preivous of new node 
        new_node.prev = last; 
     
        // Make new node next of old last 
        last.next = new_node; 
        }
    void print() {
        //write your code here
        if(head==null){
            return;
        }
        else{
         Node temp = start; 
 
   // System.out.printf("\nTraversal in forward direction \n"); 
    while (temp.next != start) 
    { 
        System.out.printf("%d ", temp.data); 
        temp = temp.next; 
    } 
    System.out.println( temp.data); 
 
   // System.out.printf("\nTraversal in reverse direction \n"); 
    Node last = start.prev; 
    temp = last; 
    while (temp.prev != last) 
    { 
        System.out.printf("%d ", temp.data); 
        temp = temp.prev; 
    } 
    System.out.printf("%d ", temp.data); 
 }
    }
    public static void main(String[] args) {
        Dublycircluatlist obj = new Dublycircluatlist();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }
        obj.print();
    }

}
