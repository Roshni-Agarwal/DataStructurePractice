package linklistDemo;

import java.util.Stack;

public class Sortstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> s = new Stack<Integer>();
	        s.push(30);
	        s.push(-5);
	        s.push(18);
	        s.push(14);
	        s.push(-3);
	        int k=0;
	        sort(s);
	        while(!s.isEmpty()&& k<2) {
	        	s.pop();
	        	 //System.out.println(s.pop());
	        	k++;
	        }
	       System.out.println(s.peek());

	}
	public static void sort(Stack<Integer> stack){
		if(!stack.isEmpty()) {
			int x=stack.pop();
		
		sort(stack);
		
		sortInsert(stack,x);
		}
	}
	public static void sortInsert(Stack<Integer> stack,int x) {
		if(stack.isEmpty() || x>stack.peek()) {
			stack.push(x);
			return;
		}
		
			int temp=stack.pop();
			sortInsert(stack,x);
			stack.push(temp);
		
	}
	

}
