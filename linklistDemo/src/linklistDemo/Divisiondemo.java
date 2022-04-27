package linklistDemo;

import java.util.Scanner;

public class Divisiondemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int num=sc.nextInt();
			foobar(num);
		}

	}
	public static void foobar(int num) {
		if(num%3==0 && num%5!=0) {
			System.out.println("foo");
		}
		else if(num%5==0 && num%3!=0) {
			System.out.println("bar");
		}
		else if(num%3==0 && num%5==0) {
			System.out.println("foobar");
		}
		else {
			System.out.println(num);
		}
		
	}

}
