package Array;

import java.util.Scanner;

public class SumOfPrime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A [] = new int[N];
		for(int i=0; i<N; i++) {
		A[i] = sc.nextInt();
		}
		// OUTPUT [uncomment & modify if required]
		System.out.print(primeNumberSum(N,A));
		sc.close();

	}
	
	public static int primeNumberSum(int N, int A[]) {
		
		int sum=0;
		for(int i=0;i<A.length;i++) {
			if(isPrime(A[i])) {
				sum=sum+A[i];
			}
		}
		return sum;	
	}
	
	public static boolean isPrime(int n) {
		
		if(n==1) {
			return false;
		}
		for(int j=2;j<=Math.sqrt(n);j++) {
			if(n%2==0) {
				return false;
			}	
		}
		return true;
	}

}
