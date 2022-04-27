package edureka;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object construction
		
		Employee eRef=new Employee();
		eRef.setEid(101);
		eRef.setEname("John");
		eRef.setEaddress("Redwood");
		
		System.out.println("Employee Details"+eRef);

	}

}
