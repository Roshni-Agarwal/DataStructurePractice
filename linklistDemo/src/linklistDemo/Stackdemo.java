package linklistDemo;

import java.util.Scanner;

public class Stackdemo {
	public static class Node {
	    private int data;
	    private Node next;
	      
	    Node(int data) {
	        super();
	        this.data = data;
	    }
	    public int getData() {
	        return data;
	    }
	    public void setData(int data) {
	        this.data = data;
	    }
	    public Node getNext() {
	        return next;
	    }
	    public void setNext(Node next) {
	        this.next = next;
	    }
	  }
	public static class Stack {
	    //write your code here
	    Node head=null;
	    public void push (int x){
	        Node temp;
	       if(head==null){
	           head=new Node(x);
	       }
	       else{
	           temp=new Node(x);
	           temp.next=head;
	           head=temp;
	           
	       }
	        
	    }
	    public String pop(){
	        if(isEmpty()){
	            return null;
	        }
	        else{
	            int temp=head.data;
	            head=head.next;
	            return String.valueOf(temp);
	        }
	    }
	    public int peek(){
	        if(isEmpty()){
	        return -1;
	        }
	        else{
	            return head.data;
	        }
	    }
	    public boolean isEmpty(){
	        return head==null;
	    }
	  }
	  public static void main(String[] args){
	    Stack s= new Stack();
	    Scanner in = new Scanner(System.in);
	    int n = in .nextInt();
	    for (int i = 0; i < n; i++) {
	        s.push( in .nextInt());
	    }
	    int topElement = s.peek();
	    if (topElement != -1)
	        System.out.println(topElement);
	    for (int i = 0; i < n; i++) {
	        System.out.println(s.pop());
	    }
	  }

}
