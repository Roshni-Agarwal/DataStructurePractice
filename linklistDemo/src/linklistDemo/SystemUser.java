package linklistDemo;

public class SystemUser {
	 int id;
	   String name;
	   String address;
	   boolean loggedIn;
	   SystemUser() {
	       System.out.println("System User Constructed");
	   }
	   SystemUser(int id, String name, String address, boolean loggedIn) {
	       this();
	       this.id = id;
	       name = name;
	       address = address;
	       this.loggedIn = loggedIn;
	   }

}
