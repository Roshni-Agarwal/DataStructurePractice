package Stack;

public class LinkedListImplementationOfStackInJava {
	
	Node head;
	int sz;
	LinkedListImplementationOfStackInJava(){
		head=null;
		sz=0;
	}
	
	void push(int x) {
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
		sz++;
	}
	
	int pop() {
		if(head==null) {
			return Integer.MAX_VALUE;
		}
		int res=head.data;
		Node temp=head;
		head=head.next;
		sz--;
		return res;
	}
	
	int peek() {
		if(head==null) {
			return Integer.MAX_VALUE;
		}
		return head.data;
	}
	
	int size() {
		return sz;
	}
	
	boolean isEmpty() {
		return head==null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImplementationOfStackInJava s=new LinkedListImplementationOfStackInJava();
		 s.push(5);
		    s.push(10);
		    s.push(20);
		    System.out.println(s.pop());
		    System.out.println(s.size());
		    System.out.println(s.peek());
		    System.out.println(s.isEmpty());

	}

}
