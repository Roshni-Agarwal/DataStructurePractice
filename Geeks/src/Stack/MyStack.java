package Stack;

import java.util.ArrayList;

public class MyStack {
	
	ArrayList<Integer> al=new ArrayList<>();
	
	void push(int x) {
		al.add(x);
	}
	
	int pop() {
		int res=al.get(al.size()-1);
		al.remove(al.size()-1);
		return res;
	}
	
	int peek() {
		return  al.get(al.size()-1);
	}
	
	int size() {
		return al.size();
	}
	
	boolean isEmpty() {
		return al.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s=new MyStack();
	    s.push(5);
	    s.push(15);
	    s.push(20);
	    System.out.println(s.pop());
	    System.out.println(s.size());
	    System.out.println(s.peek());
	    System.out.println(s.isEmpty());

	}

}
