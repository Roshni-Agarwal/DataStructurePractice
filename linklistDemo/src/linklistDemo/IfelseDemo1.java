package linklistDemo;

import java.util.Scanner;

public class IfelseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n==1) {
			System.out.println("Hufflepuff");
		}
		else if(n==2) {
			System.out.println("Gryffindor");
		}
		else if(n==3) {
			System.out.println("Slytherin");
		}
		else {
			System.out.println("Ravenclaw");
		}

	}

}
