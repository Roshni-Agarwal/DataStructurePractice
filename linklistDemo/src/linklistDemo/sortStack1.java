package linklistDemo;

import java.util.Scanner;
import java.util.Stack;

public class sortStack1 {

	   public static void main(String args[]) {
		      Stack<Integer> stack = new Stack<>();
		      Scanner s = new Scanner(System.in);
		      int n = s.nextInt();
		      while (n-- > 0)
		          stack.push(s.nextInt());
		      sort(stack);
		    }
	   static void sort(Stack<Integer> s) {
		   _sort(s);
		   printStack(s);
	   }
	   static void _sort(Stack<Integer> stack) {
		    // Write your code here
		    if(!stack.isEmpty()) {
					int x=stack.pop();
				
				_sort(stack);
				
				sortInsert(stack,x);
				}
		    
		  }
	   public static void sortInsert(Stack<Integer> stack,int x) {
			if(stack.isEmpty() || x<stack.peek()) {
				stack.push(x);
				return;
			}
			
				int temp=stack.pop();
				sortInsert(stack,x);
				stack.push(temp);
			
		}
	 static void printStack(Stack<Integer> stack)
	    {
	       
	       while(!stack.isEmpty()){
	           System.out.print(stack.pop()+",");
	       }
	    }

}
