// { Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;    
        }
}

*/

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        Set<Integer> set=new HashSet<Integer>();
        Node n1=head2;
        Node n2=head1;
        Node temp = null;
        Node current = temp;
        
        while(n1!=null){
            set.add(n1.data);
            n1=n1.next;
        }
        
        while(n2!=null){
            if(set.contains(n2.data)){
                Node _t = new Node(n2.data);
                if(temp == null){
                    temp = _t; 
                    current = temp;
                }else{
                    current.next = _t;
                    current = current.next;
                }
            }
            else{
                n2=n2.next;
            }
        }
        return temp;
    }
}
