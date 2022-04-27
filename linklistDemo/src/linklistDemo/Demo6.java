package linklistDemo;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		Demo6 de=new Demo6();
		de.linkedList(head,true);
	}
	public void linkedList(Node head, boolean flag) {
		if(head == null)
			return;
		if(flag)
			System.out.println(head.data);
		linkedList(head.next, !flag);
	}

}
