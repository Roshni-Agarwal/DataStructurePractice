package linklistDemo;

import java.util.Scanner;

public class LIneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int trackingNumber = sc.nextInt();
	     sc.nextLine();
	     String asset = sc.nextLine();
	     float value = sc.nextFloat();
	     System.out.println(trackingNumber);
	     System.out.println(asset);
	     System.out.println(value);
	        sc.close();

	}

}
