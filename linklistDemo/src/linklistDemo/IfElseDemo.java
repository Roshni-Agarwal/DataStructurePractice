package linklistDemo;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		if(number==0) {
			System.out.println("number is zero");
		}
		else if(number>0) {
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}

	}

}
